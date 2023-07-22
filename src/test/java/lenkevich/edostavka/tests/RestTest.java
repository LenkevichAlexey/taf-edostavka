package lenkevich.edostavka.tests;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import lenkevich.edostavka.domain.Domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {

    Domain po = new Domain();

    @Test
    public void testInvalidCreds() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        given().headers(po.getHeaders()).body(po.getRequestBodyWithInvalidCreds())
                .when().post(po.endPoint).then().log().all()
                .assertThat().statusCode(200)
                .body("Table[0].Error", equalTo(50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void testFillPhoneAndEmptyPassword() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        given().headers(po.getHeaders()).body((po.getRequestBodyWithEmptyPassword()))
                .when().post(po.endPoint).then()
                .assertThat().statusCode(200)
                .body("Table[0].Error", equalTo(50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void testEmptyPhoneAndFillPassword() {

        RestAssured.registerParser("text/plain", Parser.JSON);
        given().headers(po.getHeaders()).body((po.getRequestBodyWithEmptyPhone()))
                .when().post(po.endPoint).then()
                .assertThat().statusCode(200)
                .body("Table[0].Error", equalTo(50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }


    @Test
    public void testGetChocolateMilk() {
        String expected = "Шоколад «Milka» молочный, 85 г";
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("query", "milk");
        ValidatableResponse response = given().when().queryParams(queryParams).get(po.endPoint).then();
        String actual = response.extract().asString();
        Assertions.assertTrue(actual.contains(expected));
    }

    @Test
    public void testGetCoffeeMilk() {
        String expected = "Кофе в зернах «Romeo Rossi» Premium Coffee, 1 кг";
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("query", "milk coffee");
        ValidatableResponse response = given().when().queryParams(queryParams).get(po.endPoint).then();
        String actual = response.extract().asString();
        Assertions.assertTrue(actual.contains(expected));
    }
}
