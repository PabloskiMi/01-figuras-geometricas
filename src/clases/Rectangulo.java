
package clases;


public class Rectangulo extends Figura{
    
  
    private double base;
    private double altura;
    
    public Rectangulo(String nombre){
        
        super(nombre);
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
