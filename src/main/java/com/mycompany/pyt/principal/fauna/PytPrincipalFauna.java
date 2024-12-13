/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pyt.principal.fauna;

/**
 *
 * @author hp
 */
public class PytPrincipalFauna {

    public static void main(String[] args) {
        
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
