/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion_mayor;

/**
 *
 * @author Estudiante
 */
public class Funcion_mayor {
    
    public static int mayor(int a,int b,int c){
        if(a>b&&b>c){
           return a;
        }
        else if(b>a&&a>c){
            return b;
        }
        else {
            return c;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int a,b,c;
        System.out.println("Ingrese tres numeros.");
        a=lectura.nextInt();
        b=lectura.nextInt();
        c=lectura.nextInt();
        System.out.println(mayor(a,b,c));
    }
    
}
