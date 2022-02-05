package ru.netology;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.Argument;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;
import static org.hamcrest.Matchers.is;


public class postmanEcho {
    @Test
    void shouldReturnData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("123",is("some data"))
        ;
    }
}