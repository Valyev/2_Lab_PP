package com.Bank.main;

import com.Bank.Customer.Address.Address;
import com.Bank.Customer.Customer;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public void find_by_name(Customer[] list) {
        System.out.println("Available names:");
        for (Customer value : list) {
            if (value != null) {
                System.out.println(value.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name");
        String name = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < list.length; i++)
            if (list[i] != null)
                counter++;

        for (int index = 0; index < counter; index++) {
            if (Objects.equals(list[index].getName(), name)) {

                System.out.println("Found with id " + list[index].getId());
            }
        }
    }

    public int correct_number_input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number;
            try {
                System.out.println("Enter your number: ");
                number = scanner.nextInt();
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    public void negative_balance(Customer[] list) {
        int counter = 0;
        System.out.println("Customers with negative balance:");
        for (Customer value : list) {
            if (value != null && value.getBalance() < 0) {
                ++counter;
                System.out.println(value.getName() + " " + value.getSurname() + " " + value.getBalance());
            }
        }
        System.out.println("There are "+counter+" customers with debt.");
    }

    public void card_number_interval(Customer[] list) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Existing card numbers:");
        for (Customer value : list) {
            if (value != null) {
                System.out.println(value.getCard_number());
            }
        }
        long lo, hi;
        while (true) {
            System.out.println("Enter lowest limit: ");
            try {
                lo = scanner.nextLong();
                System.out.println("Enter highest limit: ");
                hi = scanner.nextLong();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
        for (Customer value : list) {
            if (value != null && value.getCard_number() > lo && value.getCard_number() < hi) {
                System.out.println(value.getName() + " " + value.getSurname() + " " + value.getCard_number());
            }
        }
    }


    public static void main(String[] args) {
        Customer[] customerlist;
        customerlist = new Customer[20];
        Address ad = new Address("Missouri", "Kansas City", "Holmes", 12, 116);
        Customer customer = new Customer(1, "Brzęczyszczykiewicz", "Grzegorz", "Davydovych", ad, 4556767412710612L, 12405.42);
        customerlist[0] = customer;
        ad = new Address("Michigan", "Grand Rapids", "Cherry SE", 8, 312);
        customer = new Customer(2, "Myskovytov", "Ivan", "Vitalievich", ad, 4556879310477564L, -24817.65);
        customerlist[1] = customer;
        ad = new Address("Alaska", "New Keiraberg", "Kuphal Green", 305, 0);
        customer = new Customer(3, "Kiehn", "Shaylee", "", ad, 3780848176784421L, 106122.15);
        customerlist[2] = customer;
        ad = new Address("Tennessee", "West Jarodborough", "Faye Court", 852, 0);
        customer = new Customer(3, "Harris", "Sonny", "", ad, 2343375254121252L, 2200);
        customerlist[3] = customer;
        ad = new Address("Florida", "New Dariusfurt", "Harvey Fall", 6280, 2412);
        customer = new Customer(4, "Goodwin", "Forrest", "", ad, 5259591350048117L, 68302.40);
        customerlist[4] = customer;
        ad = new Address("New Jersey", "Lakewood", "4th", 133, 0);
        customer = new Customer(5, "Altenwerth", "Mariana", "", ad, 4556451519295724L, -178.72);
        customerlist[5] = customer;
        ad = new Address("North Carolina", "Charlotte", "E 5th", 208, 401);
        customer = new Customer(6, "Eichmann", "Sydney", "", ad, 4929224803545900L, -865.72);
        customerlist[6] = customer;
        /////////////////////////////////
        Main rh = new Main();
        boolean program = true;
        while (program) {// Menu
            System.out.println("1 - list of customers, with the specified name, \n2 - list of customers whose credit card number is in a given interval, \n3 - the number and list of customers who are in debt (negative balance on the card), \n0 - close the program.");
            int selection = rh.correct_number_input();
            switch (selection) {
                case 1 -> rh.find_by_name(customerlist);
                case 2 -> rh.card_number_interval(customerlist);
                case 3 -> rh.negative_balance(customerlist); // provide with a number of people
                case 0 -> program = false;
            }
        }
    }
}
