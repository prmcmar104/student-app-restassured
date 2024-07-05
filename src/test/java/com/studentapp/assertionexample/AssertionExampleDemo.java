package com.studentapp.assertionexample;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class AssertionExampleDemo {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
    }


    // 1) Verify that the products of limit is equal to 10
    @Test
    public void test001() {

    }

    // 2) Verify that the products of total is = 51957
    @Test
    public void test002() {

    }

    // 3) Check the Name 'Duracell - AA Batteries (8-Pack)' is available in List of product's name
    @Test
    public void test003() {

    }

    // 4) Check Multiple Names (Energizer - MAX Batteries AA (4-Pack), Duracell - 9V Batteries (2-Pack)) are available in list of product's name
    @Test
    public void test004() {

    }

    // 5) Verify the 'name' field inside first categories map for the first data (Checking Values inside Map using hasKey(entityType))
    @Test
    public void test005() {

    }

    // 6) Check entry 'manufacturer = Energizer' is inside map of product name is 'Energizer - N Cell E90 Batteries (2-Pack)'
    @Test
    public void test006() {

    }

    // 7) Checking multiple values in the same statement
    @Test
    public void test007() {

    }

    // 8) Logical Assertions
    @Test
    public void test008() {

    }
}