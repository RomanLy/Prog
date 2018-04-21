package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.sql.*;

public class ContactDBImpl implements ContactDao {

    private static final String URL = "jdbc:h2:tcp://localhost/~/Client";
    private String username = "TEST";
    private String password = "";

    public ContactDBImpl() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Connection");
        }


//        try {
//            Connection connection = DriverManager.getConnection(URL, username, password);
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("Drop table if exists Clients");
//            statement.executeUpdate("create table Clients ( id int not null auto_increment, name VARCHAR(30) not null, PRIMARY KEY (id));");
//            statement.executeUpdate("insert into Clients set name = 'David'");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }

    @Override
    public void saveContact(Contact contact) {
        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("Drop table if exists Clients");
            statement.executeUpdate("create table Clients ( id int not null auto_increment, " +
                    "name VARCHAR(30), " +
                    "surname VARCHAR(64), " +
                    "age int, " +
                    "phoneNumber VARCHAR(13), " +
                    "PRIMARY KEY (id));");
//            statement.executeUpdate("insert into Clients set name = '"+ contact.getName() +"'");
//            statement.executeUpdate("insert into Clients set surname = '"+ contact.getSurname() +"'");
//            statement.executeUpdate("insert into Clients set age = '"+ contact.getAge() +"'");
//            statement.executeUpdate("insert into Clients set phoneNumber = '"+ contact.getPhoneNumber() +"'");
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
    public void removeContact(String name) {

    }

    @Override
    public void showAll() {

    }
}
