package com.company;

public class Address {
    private String zipcode;

    private String country;

    private String city;

    public String toString(){
        String res = "";
        res += "ZipCode: " + zipcode;
        res += "\n" + "Country: " + country;
        res += "\n" + "City: " + city;
        res += "\n";
        return res;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
