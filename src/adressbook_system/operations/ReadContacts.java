package adressbook_system.operations;

import adressbook_system.entity.Contacts;
import java.util.ArrayList;

public class ReadContacts {


    public void getContactsList() {
        ArrayList<Contacts> contactList = AddContacts.getContactList();

        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Contacts contact : contactList) {
                System.out.println(contact);
            }
        }
    }
}
