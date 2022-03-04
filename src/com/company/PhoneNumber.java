package com.company;

public class PhoneNumber {
    private String countryCode;

    private String number;

    public String toString(){
        return countryCode + number + "\n";
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() == 12){
            this.number = number;
        }
        else {
            System.out.println("Number length should be exactly 12 characters");
        }
    }
}
