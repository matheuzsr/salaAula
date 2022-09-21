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
public class CalculaDesvioPadrao implements OperacaoMatematica {

    @Override
    public double calcular(ArrayList<Double> numeroCollection) {
        CalculaSomatorio calculaSomatorio = new CalculaSomatorio();
        double soma = calculaSomatorio.calcular(numeroCollection);
        
        double p1 = 1 / Double.valueOf(numeroCollection.size() - 1);
        double somaAoQuadrado = 0;
        for (int counter = 0; counter < numeroCollection.size(); counter++) {
            somaAoQuadrado += Math.pow(numeroCollection.get(counter), 2);
        }
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeroCollection.size()));
        return Math.sqrt(p1 * p2);

    }
}
