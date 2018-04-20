package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.sql.*;

public class ContactDBImpl implements ContactDao {

    public static final String URL = "jdbc:h2:tcp://localhost/~/Client";

    public ContactDBImpl() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(URL, "Test", "");
        Statement statement = connection.createStatement()){
            statement.executeUpdate("CREATE TABLE CLIENTS (ID INT not null  AUTO_INCREMENT, " +
                    "NAME VARCHAR() not null,  PRIMARY KEY(id);");

//            statement.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void removeContact(String name) {

    }

    @Override
    public void showAll() {

    }
}
