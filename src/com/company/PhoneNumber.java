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
        this.number = number;
    }
}
