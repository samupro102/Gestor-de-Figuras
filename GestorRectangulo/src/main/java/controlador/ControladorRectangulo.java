/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Punto;
import Modelo.Rectangulo;
import vista.VistaRectangulo;
/**
 *
 * @author Windows 11
 */
public class ControladorRectangulo {
    private Rectangulo rectangulo;
    private VistaRectangulo vista;

    public ControladorRectangulo(VistaRectangulo vista) {
        this.vista = vista;
        this.rectangulo = null;
        this.vista.setControlador(this);
    }
     private boolean hayRectangulo() {
        if (rectangulo == null) {
            vista.mostrarResultado("Primero debe crear el rectángulo.");
            return false;
        }
        return true;
    }
 public void crearRectangulo() {
        Punto p1 = new Punto(vista.getX1(), vista.getY1());
        Punto p2 = new Punto(vista.getX2(), vista.getY2());
        rectangulo = new Rectangulo(p1, p2);
        vista.mostrarResultado("Creado: " + rectangulo);
    }
     public void mostrarArea() {
        if (hayRectangulo()) {
            vista.mostrarResultado("Área del rectángulo: " + rectangulo.calcularArea());
        }
    }
    public void moverRectangulo() {
        if (hayRectangulo()) {
            rectangulo.mover(vista.getDx(), vista.getDy());
            vista.mostrarResultado("Movido: " + rectangulo);
        }
    }
    public void escalarRectangulo() {
        if (hayRectangulo()) {
            rectangulo.escalar(vista.getFactor());
            vista.mostrarResultado("Escalado: " + rectangulo);
        }
    }
    public void verificarPunto() {
        if (hayRectangulo()) {
            Punto p = new Punto(vista.getPx(), vista.getPy());
            if (rectangulo.contienePunto(p)) {
                vista.mostrarResultado("El punto " + p + " está DENTRO del rectángulo.");
            } else {
                vista.mostrarResultado("El punto " + p + " está FUERA del rectángulo.");
            }
        }
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

