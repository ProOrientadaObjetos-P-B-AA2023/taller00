/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static String obtenerFrase() {
        return String.format("%s, una ciudad llena de arte y naturaleza", Palabra.obtenerPalabra());
    }
}
