import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static List<PersonDetails> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContacts() {
        System.out.println("Enter the contact details");
        PersonDetails contact = new PersonDetails();

        System.out.println("Enter the first name");
        contact.setFirstName(scanner.next());

        System.out.println("Enter the last name");
        contact.setLastName(scanner.next());

        System.out.println("Enter the address");
        contact.setAddress(scanner.next());

        System.out.println("Enter the city name");
        contact.setCity(scanner.next());

        System.out.println("Enter the zip code");
        contact.setZip(scanner.nextInt());

        System.out.println("Enter the phone number");
        contact.setPhoneNumber(scanner.nextLong());

        System.out.println("Enter the email");
        contact.setEmail(scanner.next());

        contacts.add(contact);
    }
}

