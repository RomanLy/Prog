package dao;

import model.Contact;

public interface ContactDao {

    void saveContact (Contact contact);
    void editContact ();
    void removeContact (String name);
    void showAll ();

}
