import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();

        System.out.println("1.Add Contact");
        System.out.println("2. Edit Contact");
        System.out.println("3.Delete Contact");
        int operation = scanner.nextInt();
        while (operation != 0) {
            switch (operation) {
                case 1:
                    System.out.println("Enter no of student you want to add");
                    int contactsCount = scanner.nextInt();
                    for (int i = 0; i < contactsCount; i++) {
                        addressBook.addContacts();
                    }
                    for (int i = 0; i < contactsCount; i++) {
                        System.out.println(AddressBook.contacts.get(i));
                    }
                    break;
                case 2:
                    System.out.println("enter the first name you want to edit");
                    String firstName = scanner.next();
                    addressBook.editContact(firstName);
                    break;
                case 3:
                    System.out.println("enter the first name you want to delete");
                    String FirstName = scanner.next();
                    addressBook.deleteContact(FirstName);
            }
        }
    }
}

