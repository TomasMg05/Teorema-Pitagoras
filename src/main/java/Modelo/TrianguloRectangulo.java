/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public TrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public boolean verificarTeoremaPitagoras() {
        double sumaCuadradosCatetos = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double cuadradoHipotenusa = Math.pow(hipotenusa, 2);
        return Math.abs(sumaCuadradosCatetos - cuadradoHipotenusa) < 0.0001;
    }
}

