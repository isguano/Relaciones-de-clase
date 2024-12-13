
package com.mycompany.pyt.principal.fauna;


public class Ave extends Animal {

    public double envergaduraAlas;
    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas=envergaduraAlas;
    }
    
    public void volar (){
        System.out.println(nombre+" esta volandocon una enverdadura de "+envergaduraAlas+" metros");
    }
    
    
    
}
