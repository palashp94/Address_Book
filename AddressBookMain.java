import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Address Book Program");
        AddressBook addressBook = new AddressBook();

        System.out.println("1.Add Contact");
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
                           }
            System.out.println("1.Add Contact");
            operation = scanner.nextInt();
        }
    }
}

