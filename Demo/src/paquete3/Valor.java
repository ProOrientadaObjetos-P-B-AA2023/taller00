/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Valor {
    
    public static int obtenerHabitantes(){
        return Dato.obtenerNumeroHombres() + Dato.obtenerNumeroMujeres();
    }
}
