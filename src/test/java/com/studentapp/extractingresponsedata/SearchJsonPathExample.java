package com.studentapp.extractingresponsedata;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 *  Created by Jay
 */
public class SearchJsonPathExample {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {

    }


    // 1) Extract the value of limit
    @Test
    public void test001() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of limit is : ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 2) Extract the list of IDs of all products
    @Test
    public void test002() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("List of Ids are : ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 3) Extract first product name from data by providing list index value
    @Test
    public void test003() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The first product name is : ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 4) Get the categories list of the first data
    @Test
    public void test004() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Categories list are : ");
        System.out.println("------------------End of Test---------------------------");

    }

    // 5)Print the size of data
    @Test
    public void test005() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The size of the data is : ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 6) Get All the products Name from data
    @Test
    public void test006() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The names of the products are : ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 7) Get all the values for Name == Duracell - AA Batteries (8-Pack)
    @Test
    public void test007() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The values for product name 'Duracell - AA Batteries (8-Pack)' are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 8) Get the price for product Name == Duracell - D Batteries (4-Pack)
    @Test
    public void test008() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The price of product name 'Duracell - D Batteries (4-Pack)' is : ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 9) Get the Names of products which have price less than 16.99
    @Test
    public void test009() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The names of products that price is less than 16.99 are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 10) Get the manufacturer of products whose name Start = Ene
    @Test
    public void test010() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The manufacturer of products whose name Start = Ene are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 11) Get the price of products whose name end with = Vehicles
    @Test
    public void test011() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The prices of products whose name end with = Vehicles are: ");
        System.out.println("------------------End of Test---------------------------");
    }

    // 12) Get the id of product whose name is 'Energizer - N Cell E90 Batteries (2-Pack)'
    @Test
    public void test012() {

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id of product whose name 'Energizer - N Cell E90 Batteries (2-Pack)' is : ");
        System.out.println("------------------End of Test---------------------------");
    }

}