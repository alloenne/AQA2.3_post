package ru.netology.post;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoPostTest {

    @Test
    void shouldReturnPostDates() {
        // Выполняемые действия
        // Проверки
        //.body("data", equalTo("some value"))
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))

        ;

    }

    @Test
    void shouldReturnPostRuDates() {
        // Выполняемые действия
        // Проверки
        //.body("data", equalTo("some value"))
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Котики правят миром")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Котики правят миром"))

        ;

    }
}

