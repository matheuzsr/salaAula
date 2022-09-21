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
public class CalculaMedia implements OperacaoMatematica {

    @Override
    public double calcular(ArrayList<Double> numeroCollection) {
        // Implementacao
        CalculaSomatorio calculaSomatorio = new CalculaSomatorio();
        double soma = calculaSomatorio.calcular(numeroCollection);

        return soma / numeroCollection.size();
    }
}
