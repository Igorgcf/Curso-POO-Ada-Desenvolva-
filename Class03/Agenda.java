package Class03;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void findAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts in the agenda:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public Contact findContactByName(String name) {

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void removeContact(String name) {

        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        System.out.println("Contact " + name + " removed!");
    }
}
