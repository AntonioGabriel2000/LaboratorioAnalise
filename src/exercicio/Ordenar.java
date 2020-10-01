/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Martiniano
 */
public class Ordenar {
    
    private static int[] bubbleSort(int vetor[]) {
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        return vetor;
    }
    
    private static int[] insertionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        return vetor;
    }
    
    private static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        return vetor;
    }
    
    public static OrdenacaoViewResult OrdenarPorBubbleSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        var intOrdenados = bubbleSort(intNumeros);
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + ".";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao("Sei lá");
        return resultado;
    }
    
    public static OrdenacaoViewResult OrdenarPorSelectionSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        var intOrdenados = selectionSort(intNumeros);
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + ".";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao("Sei lá");
        return resultado;
    }
    
    public static OrdenacaoViewResult OrdenarPorInsertionSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        var intOrdenados = insertionSort(intNumeros);
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + ".";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao("Sei lá");
        return resultado;
    }
    
    
   
    
}
