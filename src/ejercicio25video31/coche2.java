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
public class coche2 {
   
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    String color;
    int pesototal;
    boolean asientos_cuero,climatizador;
    
    public coche2(){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public String dime_datos_generales(){ //metodo getter
        
        return "LA PLATAFORMA DEL VEHICULO TIENE " + ruedas + 
               " RUEDAS " + ". MIDE " + largo/1000 + " METROS CON UN ANCHO DE " +
               ancho + " CM Y UN PESO DE LA PLATAFORMA DE " + peso + " KG "; 
    }
    
    public void establecer_color(String color_coche){//metodo setter
        
        color = color_coche;
        
    }
    
    public String dime_color(){
        
        return "EL COLOR DEL AUTOMVIL ES " + color;
    }
    
    public void configura_asientos(String asientos_cuero){

    if(asientos_cuero=="si"){
        
        this.asientos_cuero=true;
        
    }else{
        
        this.asientos_cuero=false;
    }
        
    }
    
    public String dime_asientos(){
        
        if(asientos_cuero==true){
            
            return "EL AUTOMIVIL TIENE ASIENTOS DE CUERO";
            
        }else{
            
            return "EL AUTOMOVIL TIENE ASIENTOS DE SERIE";
        }
    }
    
}
