package services.impl;

import dao.ContactDao;
import model.Contact;
import services.ContactService;

public class FSContactServiseImpl implements ContactService{

    private final ContactDao CONTACT_DAO;

    public FSContactServiseImpl(ContactDao contactDao) {
        this.CONTACT_DAO = contactDao;
    }


    @Override
    public void createContact(String name, String surname, int age, String phoneNumber) {
        CONTACT_DAO.saveContact(new Contact(name, surname, age, phoneNumber));
    }

    @Override
    public void deleteContact(String name) {
        CONTACT_DAO.removeContact(name);

    }

    @Override
    public void editContact() {

    }

    @Override
    public void showContacts() {
        CONTACT_DAO.showAll();
    }
}
