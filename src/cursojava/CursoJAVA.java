/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ENTRADA DE DATOS
package cursojava;

import java.util.Scanner;

/**
 * CLASE 8 - ENTRADA Y SALIDA POR CONSOLA
 *
 * @author Sonia
 */
public class CursoJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
       
        System.out.println("Escribe una pregunta: ");
        frase = entrada.nextLine();
        System.out.println("Su pregunta es: " + frase);

        int numero;
       
        System.out.println("Escribe una numero: ");
        numero = entrada.nextInt();
        System.out.println("El numero de respuesta es : " + numero);
    }

}
