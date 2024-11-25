package adressbook_system.operations;

import adressbook_system.entity.Contacts;

import java.util.stream.Stream;

public class CountContact {

    public void countContactsByCityOrState() {
        String location = AddContacts.scanner.nextLine();

        Stream<Contacts> contactsStream = AddContacts.contactList.stream().filter(equal -> equal.getCity().equalsIgnoreCase(location) || equal.getState().equalsIgnoreCase(location));
        System.out.println(contactsStream);

    }
}
