/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.estatistica.pattern;

import java.util.ArrayList;

/**
 *
 * @author logcomex
 */
public class Calculadora {

    public double calcularOperacao(OperacaoMatematica operacao, ArrayList<Double> numeroCollection) {
        return operacao.calcular(numeroCollection);
    }
}
