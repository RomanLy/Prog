package dao;

import model.Contact;

public interface ContactDao {

    void saveContact (Contact contact);
    void removeContact (Contact contact);
    void showAll ();

}
