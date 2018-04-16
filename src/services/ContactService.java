package services;

public interface ContactService {

    void createContact (String name, int age);
    void deleteContact (String name);
    void editContact ();
    void showContacts ();

}
