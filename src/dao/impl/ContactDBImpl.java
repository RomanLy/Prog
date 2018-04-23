package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.sql.*;

public class ContactDBImpl implements ContactDao {

    private static final String URL = "jdbc:h2:tcp://localhost/~/Client";
    private static final String USERNAME = "TEST";
    private static final String PASSWORD = "";
    private Statement statement;
    private Connection connection;

    public ContactDBImpl() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
//            statement.executeUpdate("Drop table if exists Clients");
            statement.executeUpdate("create table if not exists Clients ( id int not null auto_increment, " +
                    "name VARCHAR(30), " +
                    "surname VARCHAR(64), " +
                    "age int, " +
                    "phoneNumber VARCHAR(13), " +
                    "PRIMARY KEY (id));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveContact(Contact contact) {
        try {
            statement.executeUpdate("insert into clients (name, surname, age, phoneNumber)" +
                    "values ('" + contact.getName() + "'," +
                    "'" + contact.getSurname() + "'," +
                    "'" + contact.getAge() + "'," +
                    "'" + contact.getPhoneNumber() + "'" +
                    ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editContact(String name) {

//        try {
//            statement.executeUpdate("update clients set surname = 'Lion' where name = 'Roman'");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }


    @Override
    public void removeContact(String name) {
        try {
            statement.executeUpdate("delete from clients where name = '" + name + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showAll() {
        try {
         ResultSet resultSet = statement.executeQuery("select * from clients");
         while (resultSet.next()){

             String name = resultSet.getString(2);
             String surname = resultSet.getString(3);
             int age = resultSet.getInt(4);
             String phoneNumber = resultSet.getString(5);
             Contact contact = new Contact(name, surname, age, phoneNumber);
             System.out.println(contact);
         }

        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//            connection.close();
//            if (connection.isClosed()) System.out.println("Connection is closed");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
