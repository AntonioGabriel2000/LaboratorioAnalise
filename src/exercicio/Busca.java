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
        for (int i = 0; i < numeros.length; i++){
            if (buscarNumero .equals(numeros [i])){
                buscaViewResult.setEncontrado("Encontrado!");
                buscaViewResult.setIndice(Integer.toString(i));                                             
            }            
        }
        return buscaViewResult;
}
    
    public static int BuscaBinaria(int[] a, int key) {
        int begin = 0;
        int end = a.length - 1;
        while (begin <= end) {

            int middle = (begin + end) / 2;
            if (key == a[middle]) {
                return middle;
            } else if (key > a[middle]) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;  //Retorna -1 quando não é encontrado.
    }

        
        
    }
    
 
    

