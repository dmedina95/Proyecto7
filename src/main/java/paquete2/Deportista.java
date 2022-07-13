/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class Deportista extends Persona {
     public Deportista(){
    
    setNombre("Ana Osorio");
    setEdad(33);
    setId("0502198900032");
    }

    @Override
     public String lugar() {
        return"Seleccion de Volleyball";
    } 
}
