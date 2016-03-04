/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesriberadeltajo.geoapp.models.business.entities;

/**
 *
 * @author Profesor
 */
public class Cuadrado {
    //<editor-fold defaultstate="collapsed" desc="Atributos/Campos (Estado)">
   private double side;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos (Comportamientos)">
//<editor-fold defaultstate="collapsed" desc="getters/setters">
   /**
    * @return the side
    */
   public double getSide() {
       return side;
   }
   
   /**
    * @param side the side to set
    */
   public void setSide(double side) {
       if (side<=0.0)
            throw new IllegalArgumentException("Argumento no válido");
       else
            this.side = side;
   }
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="constructores">
 public Cuadrado(double side) {
        this.setSide(side);
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Métodos de los objetos">
 public double getArea(){
     return Math.pow(this.getSide(),2);
 }
 public double getPerimeter(){
     return this.getSide()*4;
 }
//</editor-fold>
   
   
//</editor-fold>

   
   


}

