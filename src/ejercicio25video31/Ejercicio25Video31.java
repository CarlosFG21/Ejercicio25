/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25video31;

/**
 *
 * @author DELL
 */
public class Ejercicio25Video31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        coche2 u = new coche2();
       
      u.establecer_color("MARRON");
      
      System.out.println(u.dime_datos_generales());
      
      System.out.println(u.dime_color());
      
      u.configura_asientos("si");
      
      System.out.println(u.dime_asientos());
      
      
        
    }
    
}
