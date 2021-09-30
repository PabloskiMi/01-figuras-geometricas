package clases;


public class Figura {
    
    protected String nombre;
    private double area;
    private double perimetro;
    
    
    public Figura(String nombre){
        
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    public double calcularArea(double b, double h){
        
        area = b * h;
        return area;
    }
    
    public double calcularArea(double r){
        
        area = Math.PI * Math.pow(r, 2);
        return area;
    }
    
    public double calcularPerimetro(double b, double h){
        
        perimetro = (b * 2) + ( h * 2 );
        
        return perimetro;
    }
    
    public double calcularPerimetro(double r){
        
        perimetro = 2 * Math.PI * r;
        
        return perimetro;
    }
   
    public void mostrarResultados(){
        
        System.out.println(" Los resultados del " + this.nombre + " son:");
        System.out.print(" Área: " + area);
        System.out.println("");
        System.out.print(" Perimetro: " + perimetro);
        
    }
    
}
