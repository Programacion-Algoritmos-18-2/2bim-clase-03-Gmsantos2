/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {
    ArrayList<Estadio> informacion; 
    
    public void agregarInformacion(ArrayList<Estadio> info){ //metodo para agregar la informacion que recibe un parametro ArrayList
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){//metodo que retorna ese ArrayList
        return informacion;
    }
    public double promedio_capacidades(){// metodo para sacar promedio
         String cadena = "";  // inicializacion de varables
         double sum = 0;
         double prom;
         for (int i= 0; i < informacion.size();i++){// for para recorrer el tamanio de  la lista que agrego 
            sum = sum + informacion.get(i).obtenerCapacidad(); // variable que va sumando  la informacion  del metodo obtenerCapacidad
         }
         prom = sum/informacion.size();
         //cadena = String.format("El promedio es: %.2f",prom);
         return prom; // retorna el promedio
    }
}
