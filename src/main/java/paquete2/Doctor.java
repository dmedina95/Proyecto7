/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class Doctor extends Persona {
   
    public Doctor(){
    
    setNombre("Francisco Mejia");
    setEdad(49);
    setId("0303197390241");
    }

    @Override
     public String lugar() {
        return"Hospital CEMESA";
    } 
}
