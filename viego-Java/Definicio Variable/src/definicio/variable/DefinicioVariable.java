/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package definicio.variable;

/**
 *
 * @author Ambiente 209-1
 */
public class DefinicioVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Para definir una variable se utiliza:
        primero el tipo de dato 
        segundo el nombre de la variable 
        int num;
        */
        
        /* Para asignacion de una variable 
        seutiliza el nombre_variable = y el valor
        ejem:
        num =5;
        */
        
        int num;
        num = 5;
        System.out.println(num);
        
        /*Tipos de datos Primitivos
        int
        float
        double
        String 
        booblena
        char 
        byte*/
        
        int num1 = 10;
        float numDecimal=5f;
        double numDecimal2=10.3;
        String nombre="Viego";
        boolean boleano=true;
        char caracter='a';
        byte numeroByte=5;
        short numeroShor=10;
        long numeroLargo=999999999;
        
        /*var definicion implicito */
        var numero3=5;
        
        /* int definicion explicito*/
        int numero4;
        
        /*Ejemplo de potencia
        Math.pow(base,Exponente)*/
        double potencia=Math.pow(2,2);
        System.out.println("Potencia: "+potencia);
        
        /*Para raiz cuadrada Math.sqrt()*/
        
        double raiz=Math.sqrt(9);
        System.out.println("Raiz: "+raiz);
        
        //Raiz cubica de 27
        
        double raizCubica=Math.pow(27,0.3333333333333333);
        System.out.println("Raiz Cubica: "+raizCubica);

        
        
    }
    
}
