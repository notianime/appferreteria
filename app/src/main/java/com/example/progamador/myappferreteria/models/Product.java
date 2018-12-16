package com.example.progamador.myappferreteria.models;

import java.util.ArrayList;

public class Product {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<String> getProductsAsString() {
        ArrayList<String> P = new ArrayList<>();
        P.add("Cemento");
        P.add("Martillos");
        P.add("Tubos");
        P.add("Tornillos");
        return P;
    }

}
