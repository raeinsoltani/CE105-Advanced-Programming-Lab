package com.company;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean addContact(Contact contact){
        for (Contact value : contacts) {
            if (contact == value) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String firstName, String lastName){
        for (int i = 0; i < contacts.size(); i++) {
            if (firstName.equals(contacts.get(i).getFirstName()) && lastName.equals(contacts.get(i).getLastName())){
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName, String lastName){
        for (Contact contact : contacts) {
            if (firstName.equals(contact.getFirstName()) && lastName.equals(contact.getLastName())) {
                return contact;
            }
        }
        return null;
    }

    public Contact[] findContacts(String group){
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

    public void printContacts(){
        for (Contact contact : contacts){
            System.out.print(contact.getFirstName());
            System.out.print(" ");
            System.out.println(contact.getLastName());
        }
    }

    public void printContacts(int i, Contact[] contacts){
        for (int j = 0; j < i; j++) {
            System.out.print(contacts[i].getFirstName());
            System.out.print(" ");
            System.out.println(contacts[i].getLastName());

        }
    }

    public void printContact(Contact contact){
        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getGroup());
        System.out.println(contact.getEmail());
        System.out.println(contact.getPhoneNumber().getCountryCode() + contact.getPhoneNumber().getNumber());
        System.out.println(contact.getAddress().getCity());
        System.out.println(contact.getAddress().getZipcode());
        System.out.println(contact.getAddress().getCountry());
    }

    public static <T> int getLength(T[] arr){
        int count = 0;
        for(T el : arr)
            if (el != null)
                ++count;
        return count;
    }

}
