/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author SENA
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private int edad;
    private String nombre;
    private int id;
    private String TipoDocumento;
    
   public void setEdad(int edadParametro){
       this.edad= edadParametro;
   }  
   public int getEdad()
   {
       return this.edad;
   }

    public void setNombre(String nombreParametro){
       this.nombre= nombreParametro;
   } 
   public String getNonbre()
   {    
       return this.nombre;
   }
   
   public void setID(int idParametro){
       this.id= idParametro;
   } 
   
   public int getId(){
       return this.id;
   }
   public void setTipoDocumento(String TipoDocumentoParametro){
    this.TipoDocumento= TipoDocumentoParametro;
}
   public String getTipoDocumento()
   {
       return this.TipoDocumento;
   }
   
   public void andar(){
   
   }
   
   public void comer() {

   }
   
}


