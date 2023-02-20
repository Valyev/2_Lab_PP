package com.Bank.Customer;

import com.Bank.Customer.Address.Address;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Address address;
    private long card_number;
    private double balance;

    public Customer(int id, String surname, String name, String patronymic, Address address, long card_number, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.card_number = card_number;
        this.balance = balance;
    }


    public Address getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public long getCard_number() {
        return card_number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
