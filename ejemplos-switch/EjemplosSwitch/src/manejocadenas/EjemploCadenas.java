/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un metodo que hace que el tipo cadena ingresado se 
        //imprima en pantalla todo minuscula
        // toUpperCase es un metodo que hace que el tipo cadena ingresado se 
        //imprima en pantalla todo mayuscula
    }
}
