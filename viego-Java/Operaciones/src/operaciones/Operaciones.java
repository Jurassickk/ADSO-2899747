/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author Ambiente 209-1
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2= 3;
        int num3=7;
        
        int suma = num1+num2;
        
        System.out.println("suma de 2 numeros: "+suma);
        
        //suma de 3 numeros
        
        int suma2 =num1+num2+num3;
        
        System.out.println("Suma de 3 numeros: "+suma2);
        
        //Promedio de 3 numeros 
        
        int promedio = suma2/3;
        
        System.out.println("El promedio de 3 numeros es: "+promedio);
        
        //Multiplicacion 
        
        int multi = num1*100;
        int multi2 = num2*10;
        int multi3 = num3*1;
        
        int sumaTotal = multi+multi2+multi3;
        
        System.out.println("Sumatoria Total: "+sumaTotal);
        
    }
    
}
