package com.infoshareacademy;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import javax.json.JsonObject;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

public class JSONLoader {

    public String showDataType(String sURL) throws IOException {
        //sURL = "http://infoshareacademycom.2find.ru/api/v2";
        URL url = new URL(sURL);

        InputStream is =  url.openStream();
        JsonReader rdr = Json.createReader(is);
        JsonObject jsonObject = rdr.readObject();

        return jsonObject.getString("datatype");

    }

    public JsonArray showDataArray(String sURL) throws IOException {
        //sURL = "http://infoshareacademycom.2find.ru/api/v2/";

        URL url = new URL(sURL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonReader jsonReader = Json.createReader(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonObject = jsonReader.readObject();

        JsonArray jsonArray = (JsonArray) jsonObject.get("data");

        return jsonArray;

    }
}
