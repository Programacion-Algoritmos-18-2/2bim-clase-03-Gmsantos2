/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionArchivosPersona;

/**
 *
 * @author Usuario
 */
public class RegistroPersona {
  
   private String nombre;
   private int edad;
   private double saldo;
   
   // el constructor sin argumentos llama a otro constructor con valores predeterminados
   public RegistroPersona() 
   {
      this( "", 0 ); // llama al constructor con dos argumentos
   } // fin del constructor de RegistroCuenta sin argumentos
  
   // inicializa un registro
   public RegistroPersona( String nom, int e )
   {
      establecerNombre( nombre );
      establecerEdad( edad);
      
   } // fin del constructor de RegistroCuenta con cuatro argumentos

   // establece el n�mero de cuenta 
   public void establecerNombre( String nom )
   {
      nombre = nom;
   } // fin del m�todo establecerCuenta

   // obtiene el n�mero de cuenta 
   public String obtenerNombre() 
   { 
      return nombre; 
   } // fin del m�todo obtenerCuenta
   
   // establece el primer nombre 
   public void establecerEdad( int e )
   {
      edad = e;
   } // fin del m�todo establecerPrimerNombre

   // obtiene el primer nombre 
   public int obtenerEdad() 
   { 
      return edad; 
   } // fin del m�todo obtenerPrimerNombre
   

}

