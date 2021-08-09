package com.redbee.academy.clase3;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        Boolean pal = true;
        Integer counter = 0;
        palabra=palabra.toLowerCase().replace(" ", "");
        while (pal && counter<palabra.length()) {
            if (palabra.charAt(counter) != palabra.charAt(palabra.length() - 1 - counter)) {
                pal = false;
            } else {
                counter++;
            }
        }
        return pal;
    }
}
