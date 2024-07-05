package com.studentapp.jsonassert;

import com.studentapp.testbase.TestBase;
import io.restassured.RestAssured;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonAssertExample extends TestBase {


    @Test
    public void getStudents() throws IOException, JSONException {
        String expectedValue = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") +
                File.separator + "file.txt")));
        String actualValue = RestAssured.given()
                .when()
                .get("/list")
                .asString();
        System.out.println(expectedValue);
        System.out.println(actualValue);
        JSONAssert.assertEquals(expectedValue, actualValue, JSONCompareMode.LENIENT);
    }

    @Test
    public void getStudentsStrict() throws IOException, JSONException {
        String expectedValue = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") +
                File.separator + "difforder.txt")));
        String actualValue = RestAssured.given().when().get("/list").asString();
        System.out.println(expectedValue);
        System.out.println(actualValue);
        JSONAssert.assertEquals(expectedValue, actualValue, JSONCompareMode.STRICT);
    }
}
