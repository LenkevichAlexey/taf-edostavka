package lenkevich.edostavka.domain;

import com.google.gson.Gson;

import java.util.HashMap;

public class Domain {

    public String endPoint = "https://api.static.edostavka.by/rest/Json";

    public HashMap<String, String> getHeaders() {

        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json; charset=UTF-8");
        return headers;

    }

    public HashMap<String, Object> getFormParamsWithInvalidCreds() {

        Data data = new Data(
                "375294324412",
                "1234",
                2,
                "edostavka.by",
                "418347c9-f388-42b8-868d-c847d33baabb",
                "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36",
                "87.252.225.97"
        );

        Packet packet = new Packet(
                null,
                "GetJWT",
                "01093ABC-6B36-450D-8FAF-EA32BCC2EAE8",
                data
        );

        HashMap<String, Object> formParams = new HashMap<>();
        formParams.put("CRC", "");
        formParams.put("Packet", packet);
        return formParams;
    }
    
    public String getRequestBodyWithInvalidCreds() {
        HashMap<String, Object> formParams = getFormParamsWithInvalidCreds();
        Gson gson = new Gson();
        return gson.toJson(formParams);
    }

    public HashMap<String, Object> getFormParamsWithEmptyPassword() {

        Data data = new Data(
                "375294324412",
                "",
                2,
                "edostavka.by",
                "418347c9-f388-42b8-868d-c847d33baabb",
                "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36",
                "87.252.225.97"
        );

        Packet packet = new Packet(
                null,
                "GetJWT",
                "01093ABC-6B36-450D-8FAF-EA32BCC2EAE8",
                data
        );

        HashMap<String, Object> formParams = new HashMap<>();
        formParams.put("CRC", "");
        formParams.put("Packet", packet);
        return formParams;
    }

    public String getRequestBodyWithEmptyPassword() {
        HashMap<String, Object> formParams = getFormParamsWithEmptyPassword();
        Gson gson = new Gson();
        return gson.toJson(formParams);
    }

    public HashMap<String, Object> getFormParamsWithEmptyPhone() {

        Data data = new Data(
                "",
                "123qweE1!",
                2,
                "edostavka.by",
                "418347c9-f388-42b8-868d-c847d33baabb",
                "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Mobile Safari/537.36",
                "87.252.225.97"
        );

        Packet packet = new Packet(
                null,
                "GetJWT",
                "01093ABC-6B36-450D-8FAF-EA32BCC2EAE8",
                data
        );

        HashMap<String, Object> formParams = new HashMap<>();
        formParams.put("CRC", "");
        formParams.put("Packet", packet);
        return formParams;
    }

    public String getRequestBodyWithEmptyPhone() {
        HashMap<String, Object> formParams = getFormParamsWithEmptyPhone();
        Gson gson = new Gson();
        return gson.toJson(formParams);
    }
}
