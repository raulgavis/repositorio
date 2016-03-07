/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesriberadeltajo.geoapp.models.business.entities;

/**
 *
 * @author raul garcia
 */
public class Rombo {
    private double dMayor, dMenor;
    /**
     * método constructor sin parámetros o constructor general
     */
    public Rombo(){                 
        this.setdMayor(1.0);
        this.setdMenor(1.0);
    }
    /**
    * @param dMayor
    * @param dMenor
    */
    public Rombo(double dMayor, double dMenor){      
        this.setdMayor(dMayor);                   
        this.setdMenor(dMenor);
    }
     /**
     * set atributo dMayor
     */
    private void setdMayor(double d) {      //Añado los métodos setdMayor y setdMenor necesarios para que funcione el método constructor con parámetros de más arriba
        this.dMayor=d;                      //Los métodos set y get permiten encapsular los atributos y que sólo sean accesibles a través de ellos
    }
     /**
     * set atributo dMayor
     */
    private void setdMenor(double d) {
        this.dMenor=d;
    }
     /**
     * @return atributo dMayor
     */
    private double getdMayor() {
        return dMayor;
    }
    /**
     * @return atributo dMenor
     */
    private double getdMenor() {
        return dMenor;
    }
   /**
    * @return area ; Método get que devuelve el área del rombo
    */
   public double getArea(){ 
        return this.getdMayor() * this.getdMenor()/2.0;
    }
   /**
    * @return perimetro ; Método get que devuelve el perímetro del rombo
    */
    public double getPerimetro(){
        double lado = Math.sqrt(Math.pow(getdMayor(),2)/2.0+Math.pow(getdMenor(),2)/2.0);  
        return lado * 4;
    }
}  

