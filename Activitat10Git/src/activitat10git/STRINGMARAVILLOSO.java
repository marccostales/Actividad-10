/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat10git;

import static imprimir.Imprimir.crearPartInferior;
import static imprimir.Imprimir.crearPartSuperior;

public class STRINGMARAVILLOSO{
    public static void main(String[] args){
        String M = "MARAVILLOSO";
        
        System.out.println("La versió que tenim a github ha estat actualitzada i és mes actual que la que tinc en local");
 
        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)
       crearPartSuperior(M);
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        crearPartInferior(M);
    }    
}
