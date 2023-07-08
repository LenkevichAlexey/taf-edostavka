package lenkevich.edostavka.tests;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.ValidationEvent;
import java.time.temporal.ValueRange;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class RestTest {

    @Test
    public void testInvalidCreds() {
        String url = "https://api.static.edostavka.by/rest/Json";
        String body = "{\n" +
                "    \"CRC\": \"\",\n" +
                "    \"Packet\": {\n" +
                "        \"JWT\": null,\n" +
                "        \"MethodName\": \"GetJWT\",\n" +
                "        \"ServiceNumber\": \"01093ABC-6B36-450D-8FAF-EA32BCC2EAE8\",\n" +
                "        \"Data\": {\n" +
                "            \"LoginName\": \"375296550009\",\n" +
                "            \"Password\": \"1q2w3e4r\",\n" +
                "            \"LoginNameTypeId\": 2,\n" +
                "            \"SourceName\": \"edostavka.by\",\n" +
                "            \"UUID\": \"54d97ed9-ad81-4006-b7e6-811fbe4a993a\",\n" +
                "            \"UserAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36\",\n" +
                "            \"IpAddress\": \"86.57.143.244\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        given().body(body).when().post(url).then().log().body().
                assertThat().statusCode(200).
                assertThat().body(containsString("{\"Table\":[{\"Error\":\"50009\",\"ErrorDescription\":\"Неверный логин или пароль\"}]}"));
    }

    @Test
    public void testFillPhoneAndEmptyPassword() {
        String url = "https://api.static.edostavka.by/rest/Json";
        String body = "{\n" +
                "    \"CRC\": \"\",\n" +
                "    \"Packet\": {\n" +
                "        \"JWT\": null,\n" +
                "        \"MethodName\": \"GetJWT\",\n" +
                "        \"ServiceNumber\": \"01093ABC-6B36-450D-8FAF-EA32BCC2EAE8\",\n" +
                "        \"Data\": {\n" +
                "            \"LoginName\": \"375296587452\",\n" +
                "            \"Password\": \"\",\n" +
                "            \"LoginNameTypeId\": 2,\n" +
                "            \"SourceName\": \"edostavka.by\",\n" +
                "            \"UUID\": \"093d5a2f-b6e8-40fe-9181-6268a53c3bbf\",\n" +
                "            \"UserAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36\",\n" +
                "            \"IpAddress\": \"37.214.30.229\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        given().body(body).when().post(url).then().log().body().
                assertThat().statusCode(200).
                assertThat().body(containsString("{\"Table\":[{\"Error\":\"50009\",\"ErrorDescription\":\"Неверный логин или пароль\"}]}"));
    }

    @Test
    public void testEmptyPhoneAndFillPassword() {
        String url = "https://api.static.edostavka.by/rest/Json";
        String body = "{\n" +
                "    \"CRC\": \"\",\n" +
                "    \"Packet\": {\n" +
                "        \"JWT\": null,\n" +
                "        \"MethodName\": \"GetJWT\",\n" +
                "        \"ServiceNumber\": \"01093ABC-6B36-450D-8FAF-EA32BCC2EAE8\",\n" +
                "        \"Data\": {\n" +
                "            \"LoginName\": \"\",\n" +
                "            \"Password\": \"1234qQ\",\n" +
                "            \"LoginNameTypeId\": 2,\n" +
                "            \"SourceName\": \"edostavka.by\",\n" +
                "            \"UUID\": \"093d5a2f-b6e8-40fe-9181-6268a53c3bbf\",\n" +
                "            \"UserAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36\",\n" +
                "            \"IpAddress\": \"37.214.30.229\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        given().body(body).when().post(url).then().log().body().
                assertThat().statusCode(200).
                assertThat().body(containsString("{\"Table\":[{\"Error\":\"50009\",\"ErrorDescription\":\"Неверный логин или пароль\"}]}"));
    }


    @Test
    public void testGetChocolateMilk() {
        String expected = "Шоколад «Milka» молочный, 85 г";
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("query", "milk");
        ValidatableResponse response = given().when().queryParams(queryParams).get("https://edostavka.by/_next/data/tA1rcRGzKJ58trXX6pujN/search.json").then();
        String actual = response.extract().asString();
        Assertions.assertTrue(actual.contains(expected));
    }

    @Test
    public void testGetCoffeeMilk() {
        String expected = "Кофе в зернах «Romeo Rossi» Premium Coffee, 1 кг";
        HashMap<String, String> queryParams = new HashMap<>();
        queryParams.put("query", "milk coffee");
        ValidatableResponse response = given().when().queryParams(queryParams).get("https://edostavka.by/_next/data/tA1rcRGzKJ58trXX6pujN/search.json").then();
        String actual = response.extract().asString();
        Assertions.assertTrue(actual.contains(expected));
    }
}
