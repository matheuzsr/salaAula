package br.ufes.estatistica.antipattern;

import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalJava {

    public static void main(String[] args) {
        ArrayList<Double> numeros
                = new ArrayList<>(Arrays.asList(
                        10.0, 5.0, 6.0, 7.0, 8.0, 2.0
                ));

        double resultado = new CalculoEstatisticoAntiPattern().calcula(CalculoEstatisticoAntiPattern.MAIOR, numeros);

        System.out.println(resultado);
    }
}
