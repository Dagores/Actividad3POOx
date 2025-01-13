/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resuelto10;

/**
 *
 * @author david
 */
public class Pago {
    
        double pat;
        double es;
        double pagmat = 50000;
        
    Pago(double pat, double es, double pagmat) {
        this.pat = pat;
        this.es = es;
        this.pagmat = pagmat;
    }
    double valor_a_pagar() {
        if ((pat > 2000000)&&(es > 3) ) {
            pagmat = pagmat + 0.03*pat;
        }
        return pagmat;
    }
    
    public double obtenerInscripcion(double inscripcion) {
        return inscripcion;
    }
    public String obtenerNombres(String nombre) {
        return nombre;  
    }
    public String Limpiar_Campo() {
        return "";    
    }
}
