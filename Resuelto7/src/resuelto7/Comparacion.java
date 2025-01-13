/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resuelto7;

/**
 *
 * @author david
 */
public class Comparacion {
    double a;
    double b;
   
 public static String comparacion(double a, double b) {   
    if (a > b) {
        return (a + " es mayor que " + b);
    }
    else if (a == b) {
        return(a + " es igual que " + b);
    }
    else {
        return(a + " es menor que " + b);
    }
 }
}
        
        
       
