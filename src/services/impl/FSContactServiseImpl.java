package services.impl;

import dao.ContactDao;
import model.Contact;
import services.ContactService;

public class FSContactServiseImpl implements ContactService{

    private final ContactDao contactDao;

    public FSContactServiseImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }


    @Override
    public void createContact(String name, String surname, int age, String phoneNumber) {
        contactDao.saveContact(new Contact(name, surname, age, phoneNumber));
    }

    @Override
    public void deleteContact(String name) {
        contactDao.removeContact(name);

    }

    @Override
    public void editContact() {

    }

    @Override
    public void showContacts() {
        contactDao.showAll();
    }
}
