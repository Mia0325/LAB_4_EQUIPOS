/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Juego {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        
        int menu=0;
        int opcion;
        String palabra = " ";
        String pares = " ";
        String impares = " ";
        String resultado= " ";
        String pares1 = " ";
        String pares2 = " ";
        String original= " ";
        
        
        
        do{
            System.out.println("********************");
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("********************");
            System.out.println("Ingresa una opcion 1-4");
            System.out.println("1. Codigo Enigma");
            System.out.println("2. Filtrar");
            System.out.println("3. Cifrado");
            System.out.println("4. Terminar Programa");
            menu = lea.nextInt();
            
            switch(menu){
                case 1://HAS SELECCIONADO CODIGO ENIGMA
                    do{
        System.out.println("**********************");
        System.out.println("----CODIGO ENIGMA----");
        System.out.println("**********************");
        System.out.println("Ingresa una opcion 1-3");
        System.out.println("1. Encriptar texto");
        System.out.println("2. Desencriptacion");
        System.out.println("3. Regresar");
        opcion = lea.nextInt();
       
           switch(opcion){
            case 1://ENCRIPTAR TEXTO
                System.out.print("Introduzca la palabra que desea encriptar: ");
                palabra =lea.next().toLowerCase();
                for(int i = 0; i < palabra.length();i++){
                char letra= palabra.charAt(i);
                if( i % 2 ==0){
                    pares +=letra;
                }else{
                    impares +=letra;
                }
              

            } /* PRIMER FOR CASE 1*/
                resultado= pares + impares;
                System.out.println("\nTexto Original:"+palabra);
                System.out.println("PALABRAS PARES:"+pares);
                System.out.println("PALABRAS IMPARES:"+impares);
                System.out.println("RESULTADO" +resultado+"\n");
               break;//`BREAK CASE 1
               
            case 2://DESIFRAR TEXTO ENCRIPTADO
                System.out.println("\nPALABRA ENCRIPTADA"+resultado);
                int mitad= palabra.length()/2;
                pares1= palabra.substring(0,mitad);
                pares2= palabra.substring(mitad);
                
                System.out.println("PARES: "+pares1);
                System.out.println("IMPARES: "+pares2);
                original= pares1+pares2;
                System.out.println("ORIGINAL: "+original+"\n");
                break;
        }/* SWITCH OPCION*/
       }while (opcion !=3);//REGRESAR A MENU PRINCIPAL
     
                case 2:
                    
                    
                    
                    
            }//switch escoger 
        }while(menu != 4);//do menu principal
    }//public static void
}//class
