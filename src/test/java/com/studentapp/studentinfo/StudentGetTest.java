package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentGetTest extends TestBase {

    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get("/lists");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void getSingleStudentInfo() {
        Response response = given()
                .pathParam("id", 5)
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void searchStudentWithParameter() {
        Map<String, Object> qParams = new HashMap<>();
        qParams.put("programme", "Computer Science");
        qParams.put("limit", 2);

        Response response = given()
                /*.queryParam("programme", "Computer Science")
                .queryParam("limit", 2)*/
                .queryParams(qParams)
                .when()
                .get("/list");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}