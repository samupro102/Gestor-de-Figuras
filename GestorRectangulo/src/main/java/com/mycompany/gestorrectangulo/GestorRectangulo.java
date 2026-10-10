/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorrectangulo;
import controlador.ControladorRectangulo;
import vista.VistaRectangulo;
/**
 *
 * @author Titoelgato
 */
public class GestorRectangulo {

    public static void main(String[] args) {
        VistaRectangulo vista = new VistaRectangulo();
        new ControladorRectangulo(vista);
        vista.setVisible(true);
    }
}
