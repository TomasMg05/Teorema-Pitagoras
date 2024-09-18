/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.TrianguloRectangulo;
import Vista.TrianguloVista;

public class TrianguloControlador {
    private TrianguloVista vista;

    public TrianguloControlador(TrianguloVista vista) {
        this.vista = vista;
    }

    public void verificarTriangulo() {
        double cateto1 = vista.obtenerLongitud("cateto 1");
        double cateto2 = vista.obtenerLongitud("cateto 2");
        double hipotenusa = vista.obtenerLongitud("hipotenusa");

        TrianguloRectangulo triangulo = new TrianguloRectangulo(cateto1, cateto2, hipotenusa);
        boolean esValido = triangulo.verificarTeoremaPitagoras();
        
        vista.mostrarResultado(esValido);
    }
}

