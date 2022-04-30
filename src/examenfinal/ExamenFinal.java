/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu=0;
        Scanner leerDato = new Scanner(System.in);

            
            
            
        while(menu!=4){
            System.out.println("1. Ejercicio 1");  
            System.out.println("2. Ejercicio 2");  
            System.out.println("3. Ejercicio 3");  
            System.out.println("4. salir");
            menu = leerDato.nextInt();
            switch(menu){
                case 1:
                    eje1();
                    break;
                
                case 2:
                    eje2();
                    break;
                
            }
            
        }


    }
    
    public static void eje1(){
        Scanner leerDato1 = new Scanner(System.in);
        Scanner leerDato2 = new Scanner(System.in);
        System.out.println("Ingrese 1 numero");
        int nume1 = leerDato1.nextInt();
        System.out.println("Ingrese 2 numero");
        int nume2 = leerDato2.nextInt();
        
        if (nume1 > nume2) {
            System.out.println("el numero mayor es" + nume1);
        }else{
            System.out.println("el numero mayor es  " + nume2);
        }
    }
    
    public static void eje2(){
        Scanner dato = new Scanner(System.in);
        System.out.println("ingresar numero para piramide");
        int filas= dato.nextInt();
        int dato2;
        dato2= filas%2;
        
        if (dato2==0) {
            System.out.println("no es numero impar");
        }else{
            for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= filas - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
        }
        
        
    }
    
    public static void eje3(){
        
    }
    
    
    
}
