package com.company;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    boolean addContact(Contact contact){
        for (Contact value : contacts) {
            if (contact == value) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    boolean deleteContact(String firstName, String lastName){
        for (int i = 0; i < contacts.size(); i++) {
            if (firstName.equals(contacts.get(i).getFirstName()) && lastName.equals(contacts.get(i).getLastName())){
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    Contact findContact(String firstName, String lastName){
        for (Contact contact : contacts) {
            if (firstName.equals(contact.getFirstName()) && lastName.equals(contact.getLastName())) {
                return contact;
            }
        }
        return null;
    }

    Contact[] findContacts(String group){
        int i = 0;
        Contact[] returnContacts = new Contact[100];
        for(Contact contact : contacts){
            if (contact.getGroup().equals(group)){
                returnContacts[i] = contact;
                i += 1;
            }
        }
        if (i == 0){
            return null;
        }
        else{
            return returnContacts;
        }
    }

    void printContacts(){
        for (Contact contact : contacts){
            System.out.print(contact.getFirstName());
            System.out.print(" ");
            System.out.println(contact.getLastName());
        }
    }
}
