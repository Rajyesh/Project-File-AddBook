package adressbook_system.operations;

import adressbook_system.entity.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContacts {
    public static ArrayList<Contacts> contactList = new ArrayList<>();
    public static ArrayList<String> uniqueList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public void addContact() {
        String firstname;
        while (true) {
            System.out.println("Enter the firstname (1-20 alphabetic characters): ");
            firstname = scanner.nextLine();
            if(!firstname.matches("^[A-Z][a-z]{1,19}$")) {

                System.out.println("Invalid First Name Entered, Please Enter The Valid FirstName: ");
                continue;
            }
            if(uniqueList.contains(firstname.toLowerCase())) {
                System.out.println("This FirstName Is Already Exist, Please Enter Other FirstName: ");
                continue;
            }
            uniqueList.add(firstname.toLowerCase());
            break;
        }
        String lastname;
        while (true) {
            System.out.println("Enter the Lastname (1-20 alphabetic characters): ");
            lastname = scanner.nextLine();
            if(!lastname.matches("^[A-Z][a-z]{1,19}$")) {

                System.out.println("Invalid Last Name Entered, Please Enter The Valid LastName: ");
                continue;
            }
            if(uniqueList.contains(lastname.toLowerCase())) {
                System.out.println("This LastName Is Already Exist, Please Enter Other LastName: ");
                continue;
            }
            uniqueList.add(lastname.toLowerCase());
            break;
        }
        String city = UserInputValidation("Enter the city name (1-15 alphabetic characters): ", "^[A-Za-z]{1,15}$", "Invalid city name entered. Please enter a valid city.");
        String state = UserInputValidation("Enter the state name (1-30 alphabetic characters): ", "^[A-Za-z\\s]{1,30}$", "Invalid state name entered. Please enter a valid state.");
        String zipcode = UserInputValidation("Enter the zipcode (6 digits): ", "^\\d{6}$", "Invalid zipcode entered. Please enter a valid zipcode.");
        String email = UserInputValidation("Enter the email id: ", "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$", "Invalid email entered. Please enter a valid email.");

        Contacts contact = new Contacts(firstname, lastname, city, state, zipcode, email);
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public String UserInputValidation(String msg, String regex, String errorMessage) {
        String input;
        while (true) {
            System.out.println(msg);
            input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    public static ArrayList<Contacts> getContactList() {
        return contactList;
    }
}
