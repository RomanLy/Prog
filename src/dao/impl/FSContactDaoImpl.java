package dao.impl;

import dao.ContactDao;
import model.Contact;

import java.io.File;

public class FSContactDaoImpl implements ContactDao {

    private static final File FILE = new File("data");
    public FSContactDaoImpl(){
    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void removeContact(Contact contact) {

    }

    @Override
    public void showAll() {

    }
}
