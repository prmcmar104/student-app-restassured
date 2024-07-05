package com.studentapp.specificationexample;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class ResponseSpecificationExample {

    private static RequestSpecBuilder builder;

    private static RequestSpecification requestSpecification;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        builder = new RequestSpecBuilder();
        builder.addHeader("Content-Type", "application/json");
        builder.addQueryParam("$limit", 2);
        requestSpecification = builder.build();
    }

    @Test
    public void test001() {
        given().log().all()
                /*.header("Content-Type", "application/json")
                .queryParam("$limit", 2)*/
                .spec(requestSpecification)
                .when()
                .get("/products/")
                .then().log().all();
    }

    @Test
    public void test002() {
        given().log().all()
                /*.header("Content-Type", "application/json")
                .queryParam("$limit", 2)*/
                .spec(requestSpecification)
                .when()
                .get("/products/")
                .then().log().all();

    }
}