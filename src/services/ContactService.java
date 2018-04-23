package services;

public interface ContactService {

    void createContact (String name, String surname, int age, String phoneNumber);
    void deleteContact (String name);
    void editContact (String name);
    void showContacts ();

}
