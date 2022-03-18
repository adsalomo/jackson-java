package com.iudigital.lab1;

public class Dimensiones {

    private Double alto;
    private Double largo;
    private Double ancho;
    private Double peso;

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Dimensiones{" + "alto=" + alto + ", largo=" + largo + ", ancho=" + ancho + ", peso=" + peso + '}';
    }

}
