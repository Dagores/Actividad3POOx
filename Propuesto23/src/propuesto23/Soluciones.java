/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propuesto23;

/**
 *
 * @author david
 */
public class Soluciones {
    double a, b, c;
    
    public static double calcular_solucion(double a, double b, double c) {
        
        double solucion;
        
        return ( (-1)*b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
        
    }
}
