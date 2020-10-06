/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Random;

/**
 *
 * @author Eduardo Martiniano
 */
public class LerValores {
    
    public static String[] LerNumeros(String numeros){
        var valores = numeros.split(",");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i].trim();
        }
        return valores;
    }
    
    public static int[] ConverterEmInteiro(String[] valores){
        int vet[] = new int[valores.length];
        
        for (int i = 0; i < valores.length; i++) {
            vet[i] = Integer.parseInt(valores[i]);
        }
        
        return vet;
    }
    public static String[] ConverterEmString(int[] valores){
        String vet[] = new String[valores.length];
        
        for (int i = 0; i < valores.length; i++) {
            vet[i] = Integer.toString(valores[i]);
        }
        
        return vet;
    }
    
    public static String ConverterVetorEmString(String[] valores){
        var vetorString = "";
        
        for (int i = 0; i < valores.length; i++) {
            if (i + 1 == valores.length){
                vetorString = vetorString + valores[i] + "";
                continue;
            }
            vetorString = vetorString + valores[i] + ", ";
        }
        return vetorString;
    }
    
    public static String GerarValores(){
        var numeros = new String();
        Random gerador = new Random();
        for (int i = 0; i < 20; i++) {
            var novoNumero = gerador.nextInt(100);
            if( i + 1 == 20){
                numeros = numeros + Integer.toString(novoNumero) + "";
                continue;
            }
            numeros = numeros + Integer.toString(novoNumero) + ",";
        }
        
        return numeros;
    }
}
