/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unida.proyecto2_polimorfismo;

/**
 *
 * @author laboratorioasu
 */
public abstract class Animal{
       protected String nombre;
       public Animal(String nombre) {this.nombre = nombre;}
       public abstract void hacerSonido();
}
