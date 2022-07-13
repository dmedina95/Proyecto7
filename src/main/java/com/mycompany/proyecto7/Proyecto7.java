/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto7;

import paquete2.Deportista;
import paquete2.Doctor;

public class Proyecto7 {

    public static void main(String[] args) {
        
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        doctor.impInformacion();
        System.out.println(doctor.lugar());
        
        deportista.impInformacion();
        System.out.println(deportista.lugar());
    }
}
