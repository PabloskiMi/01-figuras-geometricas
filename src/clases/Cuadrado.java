
package clases;


public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(String nombre){
        
        super(nombre);
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
}
