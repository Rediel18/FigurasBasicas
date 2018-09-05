package area;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        
        Areas a;
        System.out.println("Escoja figura\n1.Cuadrado\n2.Circulo\n3.Triangulo\n4.Rectangulo");
        Scanner sc = new Scanner(System.in);
        int sol = sc.nextInt();
        
        switch(sol){
            case 1: 
                a = new Cuadrado();
                System.out.println("ingrese el valor del lado");
                a.x = sc.nextDouble();
                System.out.println("Area = "+ a.Area());
                break;
                
            case 2: 
                a = new Circulo();
                System.out.println("ingrese el radio");
                a.x = sc.nextDouble();
                System.out.println("Area = "+ a.Area());
                break;
            
            case 3: 
                a = new Triangulo();
                System.out.println("ingrese base");
                a.x = sc.nextDouble();
                System.out.println("ingrese altura");
                a.y = sc.nextDouble();
                System.out.println("Area = "+ a.Area());
                break;
            case 4:
                a = new Rectangulo();
                System.out.println("ingrese base");
                a.x = sc.nextDouble();
                System.out.println("ingrese altura");
                a.y = sc.nextDouble();
                System.out.println("Area = "+ a.Area());
                break;
        }
        
    }
}
