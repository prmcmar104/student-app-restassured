package com.studentapp.assertionexample;

import com.studentapp.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Jay
 */
public class SoftAssertExample extends TestBase {

    @Test
    public void hardAssert() {
        given()
                .when()
                .get("/list")
                .then().statusCode(200)
                .body("[0].id", equalTo(1))
                .body("[0].firstName", equalTo("Vernon1"))
                .body("[0].lastName", equalTo("Harper"))
                .body("[0].programme", equalTo("Financial Analysis1"));
    }

    @Test
    public void softAssert() {
        given()
                .when()
                .get("/list")
                .then().statusCode(200)
                .body("[0].id", equalTo(1),
                        "[0].firstName", equalTo("Vernon1"),
                        "[0].lastName", equalTo("Harper"),
                        "[0].programme", equalTo("Financial Analysis1"));
    }
}