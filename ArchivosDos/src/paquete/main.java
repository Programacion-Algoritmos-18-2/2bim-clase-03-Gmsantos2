/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String args[]) {
        LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1(); //creamos un objeto de tipo leer archivo texto 1
        OperacionData operacion = new OperacionData(); //creamos un objeto tipo operacion data
        aplicacion.abrirArchivo(); //llamamos al objeto, y  a un metodo que se encuentra dentro de el 
        operacion.agregarInformacion(aplicacion.leerRegistros());//llamamos al metodo agregamos la informacion (del objeto operacion) y le mandamos  como parametro una lista del metodo que retorma la misma

        aplicacion.cerrarArchivo();//metodo para cerrar el archivo
    }
}
