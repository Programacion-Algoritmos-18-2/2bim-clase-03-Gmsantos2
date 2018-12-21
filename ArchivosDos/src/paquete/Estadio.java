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
public class Estadio {
    String nombreEstadio;
    double Capacidad;
    String tipoDeporte;
    
    public Estadio(){
         this( "", 0 ,"" );
    }
    
    public Estadio(String nE,double cap,String tDep){
      establecerNombreE( nE );
      establecerCapacidad( cap );
      establecerTipoD( tDep );
     
     } 
    public void establecerNombreE( String nE )
   {
      nombreEstadio = nE;
   } // fin del m�todo establecerNombre

   // obtiene el nombre de el estadio
   public String obtenerNombreE() 
   { 
      return nombreEstadio; 
   } // fin del m�todo obtenerNombreE
   
   // establece la capacidad
   public void establecerCapacidad( double cap )
   {
      Capacidad = cap;
   } // fin del m�todo establecerCpacidad

   // obtiene la capacidad 
   public double obtenerCapacidad() 
   { 
      return Capacidad; 
   } // fin del m�todo obtenerCapacidad
   
   // establece el tipo de deporte  
   public void establecerTipoD( String tDep )
   {
      tipoDeporte = tDep;
   } // fin del m�todo establecerTipoD

   // obtiene el tipo de deporte
   public String obtenerTipoD() 
   {
      return tipoDeporte; 
   } // fin del m�todo obtenerTipoD

    @Override
   public String toString(){ // metodo para sobreescribir
        String cadena = String.format("%s,%s,%.2f\n",obtenerNombreE(),obtenerTipoD() ,obtenerCapacidad() );
        return cadena;
   }
   
}

