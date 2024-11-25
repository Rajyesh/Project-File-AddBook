package adressbook_system.operations;

import adressbook_system.entity.Contacts;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingContact {
    public void sortContactsByName() {
        List<Contacts> collect = AddContacts.contactList.stream().sorted(Comparator.comparing(Contacts::getFirstname).thenComparing(Contacts::getLastname)).collect(Collectors.toList());

        System.out.println(collect);

    }
}
