
package com.mycompany.pyt.principal.fauna;


public class Mamifero extends Animal {

    public String tipoPelaje;
    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);
        this.tipoPelaje=tipoPelaje;
    }
    
    public void amamantarCrias(){
        System.out.println(nombre +" esta amamantando a sus crias");
    
    }
    
}
