package com.example.progamador.myappferreteria.models;

import java.util.ArrayList;

public class SubCategoria {
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
        ArrayList<String> subcat = new ArrayList<>();
        subcat.add("Clavos de albañil");
        subcat.add("Clavos uso general");
        subcat.add("Fijaciones especiales");
        subcat.add("Fijaciones para Drywall");
        subcat.add("Kit de fijaciones");
        return subcat;
    }
}
