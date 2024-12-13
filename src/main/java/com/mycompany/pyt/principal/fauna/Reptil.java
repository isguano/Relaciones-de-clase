
package com.mycompany.pyt.principal.fauna;


public class Reptil extends Animal {
 
    public String tipoEscamas;
    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);
        this.tipoEscamas= tipoEscamas;
    }
    
    public void arrastrarse (){
        System.out.println(nombre+" esta arrastarndose con sus escamas de tipo "+ tipoEscamas);
    
    
    }
    
}
