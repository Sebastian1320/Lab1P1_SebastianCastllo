
package lab1p1_sebastiancastillo_;

import java.util.Scanner;


public class Lab1P1_SebastianCastillo_ {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num=0;
        char caracter='a';
        double doble=1.25;
        boolean VoF=true;
        System.out.println("elija el ejercicio");
        num=scanner.nextInt();
        
        if(num==1){
            int num1=15;
            int num2=30;
            int resultado;
            resultado=15*30;
            System.out.print("resultado: ");
            System.out.println(resultado);
            
        
        }else if (num==2){
            System.out.println("Ingrese un numero entero");
            int numeroUsuario=scanner.nextInt();
            System.out.println("Ingrese un numero entero");
            int numeroUsuario2=scanner.nextInt();
            System.out.println("Ingrese un numero entero");
            int numeroUsuario3=scanner.nextInt();
            double promedio=(numeroUsuario+numeroUsuario2+numeroUsuario3)/3;
            
            System.out.println("Promedio: "+promedio);
            
        }else{
            System.out.println("Salio del programa");
            
        }
    }
    
}
