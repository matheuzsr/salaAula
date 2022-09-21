
package br.ufes.estatistica.antipattern;

import java.util.ArrayList;
import java.util.Collections;

public class CalculoEstatisticoAntiPattern {

    public static final int MEDIA = 0;
    public static final int SOMATORIO = 1;
    public static final int MAIOR = 2;
    public static final int MENOR = 3;
    public static final int VARIANCIA = 4;
    public static final int DESVIOPADRAO = 5;

    public double calcula(int op, ArrayList<Double> numeros) {

        if (op == CalculoEstatisticoAntiPattern.MEDIA) {
            double total = 0;
            for (int i = 0; i < numeros.size(); i++) {
                total += numeros.get(i);
            }
            return total / numeros.size();
        } else if (op
                == CalculoEstatisticoAntiPattern.SOMATORIO) {
            double soma = 0;
            for (int counter = 0; counter < numeros.size(); counter++) {
                soma += numeros.get(counter);
            }
            return soma;
        } else if (op == CalculoEstatisticoAntiPattern.MAIOR) {
            return Collections.max(numeros);
        } else if (op == CalculoEstatisticoAntiPattern.MENOR) {
            return Collections.min(numeros);
        } else if (op == CalculoEstatisticoAntiPattern.DESVIOPADRAO) {
            double soma = 0;
            {
                double p1 = 1 / Double.valueOf(numeros.size() - 1);
                double somaAoQuadrado = 0;
                for (int counter = 0; counter < numeros.size(); counter++) {
                    somaAoQuadrado += Math.pow(numeros.get(counter), 2);
                }
                for (int counter = 0; counter < numeros.size(); counter++) {
                    soma += numeros.get(counter);
                }
                double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeros.size()));
                return Math.sqrt(p1 * p2);
            }
        } else if (op == CalculoEstatisticoAntiPattern.VARIANCIA) {
            double p1 = 1 / Double.valueOf(numeros.size() - 1);
            double somaAoQuadrado = 0;
            for (int counter = 0; counter < numeros.size(); counter++) {
                somaAoQuadrado += Math.pow(numeros.get(counter), 2);
            }
            double soma = 0;
            for (int counter = 0; counter < numeros.size(); counter++) {
                soma += numeros.get(counter);
            }
            double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeros.size()));
            return p1 * p2;
        } else {
            throw new IllegalArgumentException("Falha: Informe uma operação válida");
        }
    }

}
