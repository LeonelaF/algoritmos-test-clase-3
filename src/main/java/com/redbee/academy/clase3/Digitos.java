package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        Integer count=1;
        while(numero>9){
            numero=numero/10;
            count++;

        }
        return count;
    }
}
