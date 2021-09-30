package clases;

public class Circulo extends Figura{

    private double radio;
    
    public Circulo(String nombre){
        
        super(nombre);
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
