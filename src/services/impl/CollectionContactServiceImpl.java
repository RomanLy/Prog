package services.impl;

import model.Contact;
import services.ContactService;
import java.util.HashMap;
import java.util.Map;

public class CollectionContactServiceImpl implements ContactService {

    private Map<String, Contact> contactMap = new HashMap<>();

    @Override
    public void createContact(String name, String surname, int age, String phoneNumber) {
        this.contactMap.put(name, new Contact(name, surname, age, phoneNumber ));
    }

    @Override
    public void deleteContact(String name) {
        this.contactMap.remove(name);
    }

    @Override
    public void editContact() {

    }

    @Override
    public void showContacts() {
        for (Contact contact : contactMap.values()) {
            System.out.println(contact);
        }
    }
}
