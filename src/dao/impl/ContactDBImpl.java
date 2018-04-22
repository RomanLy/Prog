package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.sql.*;

public class ContactDBImpl implements ContactDao {

    private static final String URL = "jdbc:h2:tcp://localhost/~/Client";
    private static final String USERNAME = "TEST";
    private static final String PASSWORD = "";
    private Statement statement;

    public ContactDBImpl() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
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
    public void editContact() {

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
//        try {
//            statement.executeQuery("select * from clients");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
