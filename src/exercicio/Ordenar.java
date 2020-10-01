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
    
    public static OrdenacaoViewResult insertionSort(int[] vetor) {
        OrdenacaoViewResult result = new OrdenacaoViewResult();
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        result.setNumeros(vetor);
        result.setTempoExecucao(Long.toString(tempototal));
        return result;
    }
    
    public static OrdenacaoViewResult bubbleSort(int vetor[]){
        OrdenacaoViewResult result = new OrdenacaoViewResult();
        long tempoinicial = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        result.setNumeros(vetor);
        result.setTempoExecucao(Long.toString(tempototal));
        return result;
    }
    
}
