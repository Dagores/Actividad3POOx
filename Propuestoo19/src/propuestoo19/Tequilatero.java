/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Propuesto19;

/**
 *
 * @author david
 */
public class Tequilatero {
    int lado;
    Tequilatero(int lado) {
        this.lado = lado;
    }
    double CalcularArea() {
        return (Math.pow(lado,2)*Math.sqrt(3))/4;   
    }
    double CalcularHipotenusa() {
        return (lado*Math.sqrt(3))/2;
    }
    double CalcularPerimetro() {
        return 3*lado;
    }     
}
