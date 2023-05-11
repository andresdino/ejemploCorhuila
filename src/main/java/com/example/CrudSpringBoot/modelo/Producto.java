package com.example.CrudSpringBoot.modelo;

import javax.persistence.*;

@Entity
@Table(name= "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombrePro;
    private int cantida;
    private float precioUnitario;

    public Producto() {
    }

    public Producto(int id, String nombreProducto, int cantida, float precioUnitario) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.cantida = cantida;
        this.precioUnitario = precioUnitario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
