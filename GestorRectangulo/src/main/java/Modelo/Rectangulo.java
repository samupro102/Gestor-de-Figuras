/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Punto;
        
/**
 *
 * @author Titoelgato
 */
public class Rectangulo extends FiguraGeometrica{
    private Punto esquina1;
    private Punto esquina2;

    
    public Rectangulo(Punto esquina1, Punto esquina2, String nombre) {
        super(nombre);
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }


    
}
