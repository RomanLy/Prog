package services.impl;

import dao.ContactDao;
import services.ContactService;

public class FSContactServiseImpl implements ContactService{

    private final ContactDao CONTACT_DAO;

    public FSContactServiseImpl(ContactDao contactDao) {
        this.CONTACT_DAO = contactDao;
    }


    @Override
    public void createContact(String name, String surname, int age, String phoneNumber) {

    }

    @Override
    public void deleteContact(String name) {

    }

    @Override
    public void editContact() {

    }

    @Override
    public void showContacts() {

    }
}
