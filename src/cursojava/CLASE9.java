
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonia
 */
public class CLASE9 {
     
    public static void main(String[] args) {

        String cadena;
        int numero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Dijite una cadena");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero"));
        letra = JOptionPane.showInputDialog("Dijite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Dijite un decimal"));
        
        JOptionPane.showMessageDialog(null, "La cadena es "+ cadena);
        JOptionPane.showMessageDialog(null, " El numero es: "+ numero);
        JOptionPane.showMessageDialog(null, " La letra es : "+ letra);
        JOptionPane.showMessageDialog(null, " El decimal es : "+ decimal);
        
        
        
               

    }

}

