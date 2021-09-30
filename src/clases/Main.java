
package clases;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        double area, perimetro;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Introduce el nombre de la figura: ");
        String figura = in.next();
        
        if (figura.equalsIgnoreCase("Rectangulo")) {
            
            Rectangulo rec = new Rectangulo(figura);
            
            System.out.println(" Introduce los siguientes datos: ");
            
            System.out.print(" Base: ");
            double b = in.nextDouble();
            rec.setBase(b);
            
            System.out.print(" Altura: ");
            double h = in.nextDouble();
            rec.setAltura(h);
            
            area = rec.calcularArea(b, h);
            perimetro = rec.calcularPerimetro(b, h);
            
            rec.setArea(area);
            rec.setPerimetro(perimetro);
            
            System.out.println("");
            
            rec.mostrarResultados();
            
            
        }else if(figura.equalsIgnoreCase("Cuadrado")){
            
            Cuadrado cua = new Cuadrado(figura);
            
            System.out.println(" Introduce los siguientes datos: ");
            
            System.out.print(" Lado: ");
            double l = in.nextDouble();
            cua.setLado(l);
            
            area = cua.calcularArea(l, l);
            perimetro = cua.calcularPerimetro(l, l);
            
            cua.setArea(area);
            cua.setPerimetro(perimetro);
            
            System.out.println("");
            
            cua.mostrarResultados();
            
        }else if(figura.equalsIgnoreCase("Circulo")){
            
            Circulo cir = new Circulo(figura);
            
            System.out.println(" Introduce los siguientes datos: ");
            
            System.out.print(" Radio: ");
            double r = in.nextDouble();
            cir.setRadio(r);
            
            area = cir.calcularArea(r);
            perimetro = cir.calcularPerimetro(r);
            
            cir.setArea(area);
            cir.setPerimetro(perimetro);
            
            System.out.println("");
            
            cir.mostrarResultados();
            
        }
        
    }
    
}
