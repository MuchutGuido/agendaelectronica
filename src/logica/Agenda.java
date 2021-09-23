/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import igu.Principal;

/**
 *
 * @author Guido
 */
public class Agenda {

    int cant = 10; // cantidad de contactos para almacenar
    String dnis[] = new String[cant];
    String apellidos[] = new String[cant];
    String nombres[] = new String[cant];
    String direcciones[] = new String[cant];
    String telefonos[] = new String[cant];
    String fecha_nacimientos[] = new String[cant];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Principal pant = new Principal();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
    }

    /**
     * Permite guardar un contacto en una posicion de los arrays
     *
     * @param datos un array de los datos a guardar
     * @param indice recibe la posicion en donde se guardaran los datos
     */
    public void guardar(String datos[], int indice) {
        this.dnis[indice] = datos[0];
        this.apellidos[indice] = datos[1];
        this.nombres[indice] = datos[2];
        this.direcciones[indice] = datos[3];
        this.telefonos[indice] = datos[4];
        this.fecha_nacimientos[indice] = datos[5];
        System.out.println(indice + " - Contacto agregado...");
    }

    /**
     * Permite ir una posicion anterior y carga los datos del contacto
     *
     * @param indice posicion de la cual se mostrara los datos
     * @return array con los datos del contacto o error
     */
    public String[] anterior(int indice) {
        if (indice < 0) {
            String error[] = new String[1];
            error[0] = "error";
            return error;
        } else {
            String datos[] = new String[6];
            datos[0] = this.dnis[indice];
            datos[1] = this.apellidos[indice];
            datos[2] = this.nombres[indice];
            datos[3] = this.direcciones[indice];
            datos[4] = this.telefonos[indice];
            datos[5] = this.fecha_nacimientos[indice];
            return datos;
        }
    }

    /**
     * Permite ir una posicion siguiente y carga los datos del contacto
     *
     * @param indice posicion de la cual se mostrara los datos
     * @return array con los datos del contacto o error
     */
    public String[] siguiente(int indice) {
        if (indice > this.cant - 1) {
            String error[] = new String[1];
            error[0] = "error";
            return error;
        } else {
            String datos[] = new String[6];
            datos[0] = this.dnis[indice];
            datos[1] = this.apellidos[indice];
            datos[2] = this.nombres[indice];
            datos[3] = this.direcciones[indice];
            datos[4] = this.telefonos[indice];
            datos[5] = this.fecha_nacimientos[indice];
            return datos;
        }
    }

}
