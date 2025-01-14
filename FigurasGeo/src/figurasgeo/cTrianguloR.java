/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeo;

/**
 *
 * @author david
 */
public class cTrianguloR {
    int base; 
    int altura; 

    public cTrianguloR(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }

    double calcularArea() {
    return (base * altura / 2);
    }

    double calcularPerimetro() {
    return (base + altura + calcularHipotenusa()); 
    }
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
        }

        String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa()))
        return ("Equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa()))
        return ("Escaleno");
        else
        return("Isósceles"); 
        }
}
