package adressbook_system.operations;

import adressbook_system.entity.Contacts;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByCity {
    public void searchPersonByCityOrState() {
        System.out.print("Enter City or State to search: ");
        String location = AddContacts.scanner.nextLine();

        List<Contacts> results = AddContacts.contactList.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(location) || contact.getState().equalsIgnoreCase(location))
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            System.out.println("No contacts found in " + location);
        } else {
            System.out.println("Contacts are found!");
            results.forEach(System.out::println);
        }
    }
}
