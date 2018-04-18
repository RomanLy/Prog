package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.io.*;
import java.util.Scanner;

public class FSContactDaoImpl implements ContactDao {
    public FSContactDaoImpl(){}

    private static final File FILE = new File("data.txt");

    @Override
    public void saveContact(Contact contact) {

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE, true)))) {
                writer.println(contact);
                writer.flush();
                writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeContact(String name) {

    }

    @Override
    public void showAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))){
                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
