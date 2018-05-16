package com.infoshareacademy;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Objects;

import javax.json.JsonObject;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

public class JSONLoader {

    public String jsonObjectName;

    public static String MAINLINK = "http://infoshareacademycom.2find.ru";
    public static String SUBLINK = "/api/v2";


    public String sURL;
    public String data;
    public JsonArray dataContent;

    public String showDataType(String sURL, String name) throws IOException {
        //sURL = "http://infoshareacademycom.2find.ru/api/v2";
        URL url = new URL(sURL);

        InputStream is =  url.openStream();
        JsonReader rdr = Json.createReader(is);
        JsonObject jsonObject = rdr.readObject();

        return data = jsonObject.getString(name);

    }

    public JsonArray showDataArray(String sURL) throws IOException {
        //sURL = "http://infoshareacademycom.2find.ru/api/v2/";

        URL url = new URL(sURL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonReader jsonReader = Json.createReader(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonObject = jsonReader.readObject();

        JsonArray jsonArray = (JsonArray) jsonObject.get("data");

        return dataContent = jsonArray;
    }

    public JsonArray showDataArrayForDataName(String sURL, String name) throws IOException{

        HttpURLConnection request = connectToUrl(sURL);
        request.connect();

        JsonReader jsonReader = Json.createReader(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonObject = jsonReader.readObject();

        JsonArray jsonArray = (JsonArray) jsonObject.get(name);

        return dataContent = jsonArray;
    }



    public HttpURLConnection connectToUrl(String sURL) throws IOException {

        URL url = new URL(sURL);
        return (HttpURLConnection) url.openConnection();
    }

    @Override
    public String toString() {
        return "Data : " +  data +
                "\n" + data + " : " + dataContent;


    }
}
