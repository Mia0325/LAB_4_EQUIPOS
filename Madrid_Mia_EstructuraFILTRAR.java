/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA3;

/**
 *
 * @author Mia
 */
// Eduardo Martorell y Mía Abigail Madrid
// Ejercicio N.2 - Filtrar 

import java.util.Scanner;
public class Madrid_Mia_EstructuraFILTRAR {
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        // Le pedira al usuario que ingrese la frase
        System.out.println("Ingrese una frase completa: ");
        String frase = leer.next().toLowerCase();
        
        // Solicitar un numero entero positivo, si se ingresa uno negativo. mostrara ERRROR
        // le pedira al usuario que vuelva a ingresar un numero nuevamente   
        int numero_positivo;
        do {
            System.out.println("Ingrese la longitud minima requerida (numero entero positvo): ");
            numero_positivo = leer.nextInt();
            if (numero_positivo <= 0) {
                System.out.println("ERRROR! El numero debe ser un entero mayor a 0. Intente de nuevo.");
            }
        } while (numero_positivo <=0);
         
        // Se utliza para procesar la frase
        // Se deja un espacio al final para asegurarse que la ultima palabra sea procesads
        frase = frase + " ";        
        String palabra = "";
        int index = 0;
            
        System.out.println("Palabras con mas de " + numero_positivo + " CARACTERES:");
        
        // Se recorre la frase letra por letra
        while (index < frase.length()) {
            char c = frase.charAt(index);
            
        // Ignorar los signos de puntuación comunes
        if (c == '.' || c == ';' || c == ':' || c == '!' || c == '?' || c == '"' || c == '¿' || c == '¡') {
            index++;
            continue;
        }
        
        // Si no es un espacio se agrega a la palabra que estamos construyendo
        if (c != ' ') {
           palabra = palabra + c;
        } else {
            
            // Si se encuentra un espacio significa que termino la palabra
            // Se verifica que su longitud sea mayor a numero_positivo
            if (palabra.length() > numero_positivo) {
                System.out.println("* " + palabra);
            }
            palabra = ""; //Se reinciia la variable y se pasa al siguiente caracter
        }
        index++; 
        }
        // Cerrar el scanner
        leer.close();
            
        }
    }

