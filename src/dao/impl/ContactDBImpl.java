package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDBImpl implements ContactDao {

    public static final String URL = "jdbc:h2:tcp://localhost/~/Client";

    public ContactDBImpl() {
        try {
            Class.forName("org.h2.Driver");
            try(Connection connection = DriverManager.getConnection(URL, "Test", ""))
            {Statement statement = connection.createStatement();
                statement.execute("CREATE TABLE TEST(ID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(255));");
            statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
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
