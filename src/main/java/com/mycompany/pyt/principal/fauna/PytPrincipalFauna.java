

package com.mycompany.pyt.principal.fauna;

import java.util.Scanner;


public class PytPrincipalFauna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        
        Mamifero mamifero = new Mamifero ("tigre",10,"Liso");
        mamifero.comer();
        mamifero.amamantarCrias();
        
        Ave ave = new Ave ("Aguila",20,2.5);
        ave.comer();
        ave.volar();
        
        Reptil reptil = new Reptil ("Cobra",3,"lisas");
        reptil.comer();
        reptil.arrastrarse();
        
        

    }
}
