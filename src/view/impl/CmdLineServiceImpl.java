package view.impl;
import services.ContactService;
import util.Validation;
import util.impl.Validator;
import view.UserInterfaceService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineServiceImpl implements UserInterfaceService{

    private BufferedReader br;
    private ContactService contactService;
    private Validation validation = new Validator();

    public CmdLineServiceImpl(ContactService contactService){
        this.contactService = contactService;
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void runMenu() throws IOException {
        boolean exit = true;
        while (exit){
            showMenu();
            switch (br.readLine()){
                case "1":   createContact(); break;
                case "2":   deleteContact(); break;
                case "3":   editContact(); break;
                case "4":   showContact(); break;
                case "0":   exit = false; break;
                default:    System.out.println("repeat");
            }
        }
    }
    private static void showMenu() {
        System.out.println("1. Create contact");
        System.out.println("2. Delete contact");
        System.out.println("3. Edit contact");
        System.out.println("4. Show contacts");
        System.out.println("0. Exit");
    }

    private void createContact() throws IOException {
        String name = readString("name");
        String surname = readString("surname");
        int age = readInt("age");
        String phoneNumber = readPhoneNumber("phoneNumber");
        this.contactService.createContact(name, surname, age, phoneNumber);
    }
    private void deleteContact() throws IOException {
        String name = readString("name");
        contactService.deleteContact(name);
    }
    private void editContact() throws IOException {
        String name = readString("name");
        contactService.editContact(name);

    }
    private void showContact() {
        contactService.showContacts();
    }

    private int readInt(String name) throws IOException {
        int number = 0;
        System.out.println("Enter " + name + ": ");
        String line = br.readLine();
        if (validation.numberCheck(line)){
            number = new Integer(line);
        }
        else {
            System.out.println("Incorrect "+ name + "! Please try again");
            readInt(name);
        }
        return number;
    }
    private String readString(String name) throws IOException {
        System.out.println("Enter " + name + ": ");
        String word = null;
        String line = br.readLine();
        if (validation.wordCheck(line)){
            word = line;
        }
        else {
            System.out.println("Incorrect "+ name + "! Please try again");
            readString(name);
        }
        return word;
    }
    private String readPhoneNumber(String phoneNumber) throws IOException {
        String number = null;
        System.out.println("Enter " + phoneNumber + ": ");
        String line = br.readLine();
        if (validation.phoneNumberCheck(line)){
            number = line;
        }
        else {
            System.out.println("Incorrect "+ phoneNumber + "! Please try again");
            readInt(phoneNumber);
        }
        return number;
    }

}
