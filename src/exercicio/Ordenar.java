/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

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
    
        public static int[] CountingSort(int[] v) {
	
//encontra o maior valor em v[]	
	int maior = v[0];
	for (int i = 1; i < v.length; i++) {
		if (v[i] > maior) {
			maior = v[i];
		}
	}
		
//conta quantas vezes cada valor de v[] aparece
	int[] c = new int[maior+1];//+1 pois se 10 for o maior valor, ele iria apenas de 0 a 9
	for (int i = 0; i < v.length; i++) {
		c[v[i]] += 1;
	}
		
//acumula as vezes de cada elemento de v[] com os elementos anteriores a este
	for (int i = 1; i < c.length; i++) {
		c[i] += c[i-1];
	}
		
//adiciona os elementos em suas posições conforme o acumulo de suas frequencias
	int[] b = new int[v.length];
	for (int i = b.length-1; i >= 0; i--) {//percorre do fim para o inicio para manter estavel, mas não haveria problema em i = 0; i < b.lenght; i++
		b[c[v[i]] -1] = v[i];
		c[v[i]]--;
	}
	
	return b;
}
    
    public static OrdenacaoViewResult OrdenarPorBubbleSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        long tempoInicial = System.nanoTime();
        var intOrdenados = bubbleSort(intNumeros);
        long tempoFinal = System.nanoTime();
        long tempoTotal = tempoFinal - tempoInicial;
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + "";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao(Long.toString(tempoTotal));
        return resultado;
    }
    
    public static OrdenacaoViewResult OrdenarPorSelectionSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        long tempoInicial = System.nanoTime();
        var intOrdenados = selectionSort(intNumeros);
        long tempoFinal = System.nanoTime();
        long tempoTotal = tempoFinal - tempoInicial;
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + "";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao(Long.toString(tempoTotal));
        return resultado;
    }
    
    
   
    
    
    
    
    
    
    public static OrdenacaoViewResult OrdenarPorInsertionSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        long tempoInicial = System.nanoTime();
        var intOrdenados = insertionSort(intNumeros);
        long tempoFinal = System.nanoTime();
        long tempoTotal = tempoFinal - tempoInicial;
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + "";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao(Long.toString(tempoTotal));
        return resultado;
    } 
    
    
    public static OrdenacaoViewResult OrdenarPorCountingSort(String txt){
        var txtNumeros = LerValores.LerNumeros(txt);
        var intNumeros = LerValores.ConverterEmInteiro(txtNumeros);
        long tempoInicial = System.nanoTime();
        var intOrdenados = CountingSort(intNumeros);
        long tempoFinal = System.nanoTime();
        long tempoTotal = tempoFinal - tempoInicial;
        var txtOrdenados = LerValores.ConverterEmString(intOrdenados);
        var resultado = new OrdenacaoViewResult();
        var vetor = "";
        for (int i = 0; i < txtOrdenados.length; i++) {
            if( i + 1 == txtOrdenados.length){
                vetor = vetor + txtOrdenados[i] + "";
                continue;
            }
            vetor = vetor + txtOrdenados[i] + ", ";
        }
        resultado.setNumeros(vetor);
        resultado.setTempoExecucao(Long.toString(tempoTotal));
        return resultado;
    }
    
}
