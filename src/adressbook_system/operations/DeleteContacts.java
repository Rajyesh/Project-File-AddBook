package adressbook_system.operations;


public class DeleteContacts {
    public void deleteUser() {
        System.out.println("Enter the Number: ");
        int scan = AddContacts.scanner.nextInt();
        AddContacts.contactList.remove(scan);

    }

}
