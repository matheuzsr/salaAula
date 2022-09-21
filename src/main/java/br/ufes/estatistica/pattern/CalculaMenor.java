/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.estatistica.pattern;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class CalculaMenor implements OperacaoMatematica {

    @Override
    public double calcular(ArrayList<Double> numeroCollection) {
        return Collections.min(numeroCollection);
    }
}
