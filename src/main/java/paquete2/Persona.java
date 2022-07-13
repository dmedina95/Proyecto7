/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public abstract class Persona {
    
    public String nombre;
    public int edad;
    public String id;
    private String lugar;
    
    public Persona(){   
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
     public int getEdad(){
        return edad;
    }
     
    public void setId(String id){
        this.id = id;
    }
     public String getId(){
        return id;
    }
    
    public void impInformacion(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(id);
    } 
    
    abstract String lugar();
}
