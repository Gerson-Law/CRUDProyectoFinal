package com.itca.crud_proyecto_final.ui.slideshow;

public class products {

        String id_producto;
        String nom_producto;
        String des_producto;
        double cantidad;
        double precio;


        public products() {

        }

        public products(String id_producto, String nom_producto, String des_producto, double cantidad, double precio) {
            this.id_producto = id_producto;
            this.nom_producto = nom_producto;
            this.des_producto = des_producto;
            this.cantidad = cantidad;
            this.precio = precio;

}


    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getDes_producto() {
        return des_producto;
    }

    public void setDes_producto(String des_producto) {
        this.des_producto = des_producto;
    }

    public double getStock() {
        return cantidad;
    }

    public void setStock(double cantidad) { this.cantidad = cantidad; }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
