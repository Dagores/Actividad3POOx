/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author david
 */
public class Trapecio {
    int B;
    int b;
    int l;
    int h;
    
    
    public Trapecio(int B, int b, int l, int h) {   
        this.B = B;
        this.b = b;
        this.l = l;
        this.h = h; 
    }
    
    double calcularArea() {
    return ((B + b)/2)*h;
    }

    double calcularPerímetro() {
    return B + b + l + l;
    }
}

