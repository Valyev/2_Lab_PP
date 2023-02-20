package com.Bank.Customer.Address;

public class Address {
    private String state;
    private String city;
    private String street;
    private int house_number;
    private int apartment_number;

    public Address(String state, String city, String street, int house_number, int apartment_number) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.house_number = house_number;
        this.apartment_number = apartment_number;
    }

    public int getApartment_number() {
        return apartment_number;
    }

    public int getHouse_number() {
        return house_number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public void setApartment_number(int apartment_number) {
        this.apartment_number = apartment_number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}
