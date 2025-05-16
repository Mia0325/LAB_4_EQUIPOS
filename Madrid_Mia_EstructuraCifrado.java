/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA3;

/**
 *
 * @author Mia
 */
import java.util.Scanner;

public class Madrid_Mia_EstructuraCifrado {
    public static void main(String[] args) {
        
Scanner leer = new Scanner (System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase completa: ");
        String frase = leer.next();
        
        // Pedir un numero entero positivo, si no es positivo mostrara ERROR y que el usuario vuelva a ingresar  el numero
        int numero_desplazamiento;
        do {
            System.out.println("Ingrese la longitud minima requerida (numero entero positvo): ");
            numero_desplazamiento = leer.nextInt();
            if (numero_desplazamiento <= 0) {
                System.out.println("ERRROR !!!");
                System.out.println("El numero debe ser un entero mayor a 0.");
                System.out.println("INTENTE NUEVAMENTE.");
            }
        } while (numero_desplazamiento <=0);
        
        // Asegurarse que el desplazamiento no pase de 26
        numero_desplazamiento = numero_desplazamiento % 26;
        
        //Variable donde se guardara el resultado final
        String resultado = "";
        
        //Inicializar el contador en 0 y recorrer cada caracter de la frase
        int index = 0;
        while (index < frase.length()) {
             char c = frase.charAt(index);
             
             // Proceso para letras mayusculas
             if (c >= 'A' && c <= 'Z') {
                 char cifrado = (char)(c + numero_desplazamiento);
                 if (cifrado > 'Z') {
                     cifrado = (char)(cifrado - 26);
                 }
                 resultado = resultado + cifrado;
                 }
             
             // Proceso para letras minusculas
             else if (c >= 'a' && c <= 'z') {
                char cifrado = (char)(c + numero_desplazamiento);
                 if (cifrado > 'z') {
                     cifrado = (char)(cifrado - 26); 
                 }
                 resultado = resultado + cifrado;
             }
             else {
                 resultado = resultado + c;
             }
             
             //Pasar al siguiente caracter de la frase
             index++;
        }
        System.out.println("Frase cifrada:");
        System.out.println(resultado);
    }
   
}
