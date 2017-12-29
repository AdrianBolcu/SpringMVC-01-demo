package com.springapp.mvc;

/**
 * Created by Mindit on 12/29/2017.
 */
public class Address {
    private String country;
    private String city;
    private String street;
    private int pincode;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {

        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getPincode() {
        return pincode;
    }
}
