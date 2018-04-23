package dao;

import model.Contact;

public interface ContactDao {

    void saveContact (Contact contact);
    void editContact (String name);
    void removeContact (String name);
    void showAll ();

}
