package adressbook_system.main;

import adressbook_system.operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddContacts addContacts = new AddContacts();
        ReadContacts readContacts = new ReadContacts();
        DeleteContacts deleteContacts = new DeleteContacts();
        UpdateContacts updateContacts = new UpdateContacts();
        SearchByCity searchByCity = new SearchByCity();
        CountContact countContact = new CountContact();
        SortingContact sortingContact = new SortingContact();


        while (true) {
            System.out.println("Welcome to Address Book System!");
            System.out.println("1. Add Contact");
            System.out.println("2. Read Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Search by City/state");
            System.out.println("6. Count by City/state");
            System.out.println("7. Sort by name");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (choice) {
                    case 1:
                        addContacts.addContact();
                        break;
                    case 2:
                        readContacts.getContactsList();
                        break;
                    case 3:
                        deleteContacts.deleteUser();
                        break;
                    case 4:
                        updateContacts.updateContact();
                        break;
                    case 5:
                        searchByCity.searchPersonByCityOrState();
                        break;
                    case 6:
                        countContact.countContactsByCityOrState();
                        break;
                    case 7:
                        sortingContact.sortContactsByName();
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input Type is Entered, Please Entered The Valid InputType!");
                System.out.println("Error"+e.getMessage());
                scanner.nextLine();

            }
        }
    }
}