package com.example.progamador.myappferreteria.models;

import java.util.ArrayList;

public class Categoria {
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
        ArrayList<String> cat = new ArrayList<>();
        cat.add("Producto para fijacion");
        cat.add("Accesorio para puerta");
        cat.add("Amrres y mallas");
        cat.add("Chapa y cerrajeria");
        return cat;
    }
}
