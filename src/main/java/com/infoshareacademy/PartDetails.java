package com.infoshareacademy;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.IOException;
import java.util.List;
import java.util.Map;


class PartDetails {

    private String id;
    private List<PartDescription> partDescription;
    private Map<String, String> properties;
    private String pdfFileAdress;
    private String imgFileAdress;
    private String moreInfo;

}


class PartDescription{

    private String number;
    private String brand;
    private String name;
    private String status;


    public PartDescription(String number, String brand, String name, String status){

        this.number = number;
        this.brand = brand;
        this.name = name;
        this.status = status;

    }

}

class PartSubList{

    private List<Stock> listOfSubParts;

}

