package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.io.*;

public class FSContactDaoImpl implements ContactDao {

    private static final File FILE = new File("data.txt");
    public FSContactDaoImpl(){
    }

    @Override
    public void saveContact(Contact contact) {

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE, true)))) {
                writer.println(contact);
                writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeContact(Contact contact) {

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
