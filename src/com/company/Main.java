package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true){
            String input = scanner.nextLine();
            String[] inputs = input.split(" ", -2);
            if (inputs[0].equals("contacts")){
                if (inputs[1].equals("-a")){
                    String firstName = inputs[2];
                    String lastName = inputs[3];
                    Contact exContact = new Contact();
                    exContact.setFirstName(firstName);
                    exContact.setLastName(lastName);
                    System.out.println("Please enter Contact's group: ");
                    String group = scanner.next();
                    exContact.setGroup(group);
                    System.out.println("Please enter contact's email: ");
                    String email = scanner.next();
                    exContact.setEmail(email);
                    System.out.println("Please enter contact's country Code: ");
                    PhoneNumber phoneNumber = new PhoneNumber();
                    String countryCode = scanner.next();
                    phoneNumber.setCountryCode(countryCode);
                    System.out.println("Please enter contact's Phone Number: \n" +
                            "<please note that only 12 digits phone numbers are accepted>");
                    String number = scanner.next();
                    phoneNumber.setNumber(number);
                    exContact.setPhoneNumber(phoneNumber);
                    System.out.println("Please enter Contact's Zip Code: ");
                    Address address = new Address();
                    String zipcode = scanner.next();
                    address.setZipcode(zipcode);
                    System.out.println("Please enter city: ");
                    String city = scanner.next();
                    address.setCity(city);
                    System.out.println("Please enter country: ");
                    String country = scanner.next();
                    address.setCountry(country);
                    exContact.setAddress(address);
                    boolean res = phoneBook.addContact(exContact);
                    if (res){
                        System.out.println("Done\nContact, Saved!");

                    }
                    else {
                        System.out.println("Error!");
                        System.out.println("Contact with same name already exists!");
                    }

                }
                else if (inputs[1].equals("-r")){
                    String firstName = inputs[2];
                    String lastName = inputs[3];
                    boolean res = phoneBook.deleteContact(firstName, lastName);
                    if (res){
                        System.out.println("Contact successfully deleted!");
                    }
                    else {
                        System.out.println("Contact with this name doesn't exist!");
                    }
                }
            }
            else if (inputs[0].equals("show")){
                if (inputs.length == 1){
                    phoneBook.printContacts();
                }
                else if (inputs[1].equals("-g")){
                    String group = inputs[2];
                    Contact[] contacts = phoneBook.findContacts(group);
                    int length = contacts.length;
                    phoneBook.printContacts(length, contacts);
                }
                else if (inputs[1].equals("-c")){
                    String firstName = inputs[2];
                    String lastName = inputs[3];
                    Contact contact = phoneBook.findContact(firstName, lastName);
                    phoneBook.printContact(contact);
                }
            }
            else if (inputs[0].equals("exit")){
                break;
            }
            else {
                System.out.println("invalid syntax!");
            }
        }
    }
}

