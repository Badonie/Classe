/* No console você põe uma palavra como "Hola" e o numero "15" e isso vai fazer como que repita as 15 vezes que pediu
"Hola: 0" dai depois "Hola: 1" e isso ate completar as 15 vezes que pediu. */ 

package com.mycompany.argumentos_2;

public class Argumentos_2 { 
    
        public static void main(String[] args) { // Funciona.
        
        String arg1 = args[0];
        String arg2 = args[1];
        int arg2_num = Integer.parseInt(arg2); // Transforma o string "arg2" em numero.
        
        for (int i=0;i<arg2_num;i++){
            System.out.println(arg1 + ": " + i);
        }       
    }
}

