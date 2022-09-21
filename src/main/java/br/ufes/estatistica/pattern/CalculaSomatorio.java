/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.estatistica.pattern;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class CalculaSomatorio implements OperacaoMatematica {

    @Override
    public double calcular(ArrayList<Double> numeroCollection) {
        // Implementacao
        double soma = 0;
        for (int counter = 0; counter < numeroCollection.size(); counter++) {
            soma += numeroCollection.get(counter);
        }
        return soma;
    }

}
