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
}
