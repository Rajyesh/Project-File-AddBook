package adressbook_system.operations;

import adressbook_system.entity.Contacts;

public class UpdateContacts {
    public void updateContact() {
        System.out.print("Enter the contact index to update: ");
        int index = AddContacts.scanner.nextInt();
        AddContacts.scanner.nextLine();

        if (index < 0 || index >= AddContacts.contactList.size()) {
            System.out.println("Invalid contact index.");
            return;
        }

        Contacts contact = AddContacts.contactList.get(index);

        String firstName = UserInputValidation("Enter the first name (1-20 alphabetic characters):", "^[A-Z][a-z]{1,19}$");
        contact.setFirstname(firstName);
        String lastName = UserInputValidation("Enter the last name (2-20 alphabetic characters):", "^[A-Z][a-z]{1,19}$");
        contact.setLastname(lastName);
        String city = UserInputValidation("Enter the city name (1-15 alphabetic characters):", "^[A-Za-z]{1,15}$");
        contact.setCity(city);
        String state = UserInputValidation("Enter the state name (1-30 alphabetic characters):", "^[A-Za-z\\s]{1,30}$");
        contact.setState(state);
        String zipcode = UserInputValidation("Enter the zipcode (6 digits):", "^\\d{6}$");
        contact.setZipcode(zipcode);
        String email = UserInputValidation("Enter the email id:", "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");
        contact.setEmail(email);
        System.out.println("Contact updated successfully!");
    }

    public String UserInputValidation(String prompt, String regex) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = AddContacts.scanner.nextLine();
            if (input.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid input.");
            }
        }
        return input;
    }

}
