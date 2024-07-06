package com.studentapp.specificationexample;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by Jay
 */
public class ResponseSpecificationExample {

    private static RequestSpecBuilder builder;

    private static RequestSpecification requestSpecification;

    private static ResponseSpecBuilder responseSpecBuilder;

    private static ResponseSpecification responseSpecification;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        builder = new RequestSpecBuilder();
        builder.addHeader("Content-Type", "application/json");
        builder.addQueryParam("$limit", 2);
        requestSpecification = builder.build();

        responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectStatusCode(200);
        responseSpecBuilder.expectResponseTime(lessThan(5000l), TimeUnit.MILLISECONDS);
        responseSpecBuilder.expectHeader("Content-Type", "application/json; charset=utf-8");

        responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void test001() {
        given().log().all()
                /*.header("Content-Type", "application/json")
                .queryParam("$limit", 2)*/
                .spec(requestSpecification)
                .when()
                .get("/products/")
                .then().log().all().spec(responseSpecification);
    }

    @Test
    public void test002() {
        given().log().all()
                /*.header("Content-Type", "application/json")
                .queryParam("$limit", 2)*/
                .spec(requestSpecification)
                .when()
                .get("/products/")
                .then().log().all().spec(responseSpecification);

    }
}