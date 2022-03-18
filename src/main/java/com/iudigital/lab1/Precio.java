package com.iudigital.lab1;

import java.util.Date;

public class Precio {

    private Double precio;
    private Double precioConDescuento;
    private Date precioConDescValidoHasta;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecioConDescuento() {
        return precioConDescuento;
    }

    public void setPrecioConDescuento(Double precioConDescuento) {
        this.precioConDescuento = precioConDescuento;
    }

    public Date getPrecioConDescValidoHasta() {
        return precioConDescValidoHasta;
    }

    public void setPrecioConDescValidoHasta(Date precioConDescValidoHasta) {
        this.precioConDescValidoHasta = precioConDescValidoHasta;
    }

    @Override
    public String toString() {
        return "Precio{" + "precio=" + precio + ", precioConDescuento=" + precioConDescuento + ", precioConDescValidoHasta=" + precioConDescValidoHasta + '}';
    }

}
