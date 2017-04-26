/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2.java;

public class Clase2Java
{
    private String direction;
    private String pet;
    
  //Set all
    
   public void setDirection(String directionPara)
   {
       this.direction= directionPara;
   }
   
   public void setPet (String petPara)
   {
       this.pet= petPara;
   }
    
   //get all
    
    public String getDirection()
    {
       return this.direction;
    }
    
    public String getPet()
    {
        return this.pet;
    }
    
  public static void main (String[] args)    
    {
        Clase2Java Aprendiz1 = new  Clase2Java();
        Aprendiz1.setDirection("cll 103 #73-56");
        Aprendiz1.setPet("Toby");
        System.out.println("Su mascota se llama: " + Aprendiz1.getPet());
        System.out.println("La direccion de su vivienda es: " + Aprendiz1.getDirection() );
       
    }
   
}