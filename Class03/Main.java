package Class03;

import Class04.BankAccount;
import Class04.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello world!");
        System.out.println("\n------------------------------");

        Car car = new Car();
        car.Color = "Red";
        car.Brand = "Toyota";
        car.Wheel = 27;
        car.LicensePlate = "XYZ-1234";

        System.out.println("Car Details:");
        System.out.println("Color: " + car.Color);
        System.out.println("Brand: " + car.Brand);
        System.out.println("Wheel: " + car.Wheel);
        System.out.println("License Plate: " + car.LicensePlate);

        Agenda agenda = new Agenda();

        Contact contact = new Contact("John Doe", "123-456-7890");
        Contact contact01 = new Contact("Jane Smith", "987-654-3210");

        agenda.addContact(contact);
        agenda.addContact(contact01);

        System.out.println("------------------------------");
        System.out.println("\nContact list:");
        agenda.findAllContacts();

        System.out.println("\nFinding contact by name:");
        Contact foundContact = agenda.findContactByName("John Doe");
        if (foundContact != null) {
            System.out.println("Found contact: " + foundContact);
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("\nRemoving contact:");
        agenda.removeContact("John Doe");
        System.out.println("Updated contact list:");
        agenda.findAllContacts();
    }
}