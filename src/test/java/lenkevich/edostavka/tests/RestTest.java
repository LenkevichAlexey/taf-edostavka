package lenkevich.edostavka.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestTest {

    @Test
    public void testEdostavka() {
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
        given().when().body(body).post("https://api.static.edostavka.by/rest/Json").then().log().body();
        String acrualResult = "{\"Table\":[{\"Error\":\"50009\",\"ErrorDescription\":\"Неверный логин или пароль\"}]}";
        Assertions.assertEquals("{\"Table\":[{\"Error\":\"50009\",\"ErrorDescription\":\"Неверный логин или пароль\"}]}", acrualResult);
    }
}
