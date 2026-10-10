/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author Titoelgato
 */
public class Rectangulo extends FiguraGeometrica {
    private Punto esquina1;
    private Punto esquina2;

    public Rectangulo(Punto esquina1, Punto esquina2) {
        super("Rectángulo");
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }

    public Punto getEsquina1() {
        return esquina1;
    }

    public Punto getEsquina2() {
        return esquina2;
    }

    public double getBase() {
        return Math.abs(esquina2.getX() - esquina1.getX());
    }

    public double getAltura() {
        return Math.abs(esquina2.getY() - esquina1.getY());
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public void mover(double dx, double dy) {
        esquina1.setX(esquina1.getX() + dx);
        esquina1.setY(esquina1.getY() + dy);
        esquina2.setX(esquina2.getX() + dx);
        esquina2.setY(esquina2.getY() + dy);
    }
    
    
}
