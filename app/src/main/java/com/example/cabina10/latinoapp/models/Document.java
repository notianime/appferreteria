package com.example.cabina10.latinoapp.models;
import java.util.ArrayList;
import java.util.Date;

public class Document {
    int idDocument;
    String Nombre, Descripcion;
    String Ruta;
    Date Fecha;

    public Document(int id, String _name, String _description, Date _fecha, String _path) {
        this.idDocument = id;
        this.Nombre = _name;
        this.Descripcion = _description;
        this.Fecha = _fecha;
        this.Ruta = _path;
    }

    public String getRuta() {
        return this.Ruta;
    }
    public String getNombre (){
        return this.Nombre;
    }
    public String getDescripcion() {
        return this.Descripcion;
    }
    public String getFechaText() {
        return this.Fecha.toString();
    }

    public static ArrayList<Document> getDocuments() {
        ArrayList<Document> _list = new ArrayList<>();
        _list.add(new Document(1, "Producto1", "El producto", new Date(2019,01,01), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        _list.add(new Document(1, "Producto2", "El producto", new Date(2019,12,12), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        _list.add(new Document(1, "Producto3", "El producto", new Date(2019,12,12), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        _list.add(new Document(1, "Producto4", "El producto", new Date(2019,12,12), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        _list.add(new Document(1, "Producto5", "El producto", new Date(2019,12,12), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        _list.add(new Document(1, "Producto6", "El producto", new Date(2019,12,12), "https://issuu.com/promarthomecenter/docs/lima_-_encarte_especial_pisos_-_ene?e=11452420/66819146"));
        return _list;
    }

    public String toString() {
        return this.Nombre;
    }
}