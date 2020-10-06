/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Biel
 */
public class Busca {
    
    
    
    public static BuscaViewResult BuscaSequencial(String[]numeros, String buscarNumero){
 
        var buscaViewResult = new BuscaViewResult();
        buscaViewResult.setResultado("O valor não foi encontrado!");
        for (int i = 0; i < numeros.length; i++){
            if (buscarNumero .equals(numeros [i])){
                buscaViewResult.setResultado("O valor foi encontrado no indice " + Integer.toString(i));
            }            
        }
        return buscaViewResult;
}
    
    public static BuscaViewResult BuscaBinaria(int[] vetor, int buscar) {
        var buscaViewResult = new BuscaViewResult();
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;
            if (buscar == vetor[meio]) {
                buscaViewResult.setResultado("O valor foi encontrado");
                return buscaViewResult;
            } else if (buscar > vetor[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return buscaViewResult;
    }        
}
    
 
    

