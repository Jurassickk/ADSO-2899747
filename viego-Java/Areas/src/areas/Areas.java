/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areas;

/**
 *
 * @author Ambiente 209-1
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Area Triangulo 
        int baseT = 3;
        int alturaT = 4;
        
        int areaT = baseT*alturaT/2;
        
        System.out.println("Area Triangulo: "+areaT);
        
        //Area rectangulo 
        int largoR = 10;
        int anchoR = 3;
        
        int  areaR = largoR*anchoR;
        
        System.out.println("Area rectangulo: "+areaR);
        
        //Area Circuferencia 
        
        int radio = 5;
        
        double potencia=Math.pow(radio,2);
        double pi=Math.PI;
        
        double areaC=pi*potencia;
               
        System.out.println("Area Circuferencia: "+areaC);
        
        //Area Trapecio
        
        int base1 =5;
        int base2 =5;
        int altura = 10;
        
        int sumaB = base1+base2;
        
        int areaTrapecio =(sumaB*altura)/2;
        
        System.out.println("Area de Trapecio: "+areaTrapecio);
        
        //Area rombo
        
        int diagonalMayor = 10;
        int diagonalMenor = 3;
        
        int areaRombo =(diagonalMayor*diagonalMenor)/2;
        
        System.out.println("Area Rombo: "+areaRombo);
        
        //Area Cuadrado
        
        int baseC = 7;
        int alturaC = 7;
        
        int areaCuadrado = baseC*alturaC;
        
        System.out.println("Area Cuadrado: "+areaCuadrado);
        
        
        //Hospital
        
        int monto = 4000000;
        
        float porcentaje1 = (monto*30)/100;
        float porcentaje2 = (monto*40)/100;
        
        System.out.println("Ginecologia: "+porcentaje2); 
        System.out.println("Traumatologia: "+porcentaje1);
        System.out.println("Pediatria: "+porcentaje1);
        
        //El que se corre
        
       int lunes = 30;
       int miercoles = 20;
       int viernes = 10;
       
       int promedio = (lunes+miercoles+viernes)/3;
       
        System.out.println("Promedio Tiempo: "+promedio+"Minutos");
        
        //Examen
        
        
       int examen = 10;
       int tarea1 = 30;
       int tarea2 = 40;
       int tarea3 = 50;
       
       double promedio2 = (tarea1+tarea2+tarea3)/3;
       
       double porcentajee = (promedio2*10)/100;
       double porcentaje4 = (examen*90)/100;
       
        System.out.println("Porcentaje examen: "+porcentaje4);
        System.out.println("Porcentaje Tareas: "+porcentajee);
       
       
       
       
  
                
               
                
                               
    }
    
}
