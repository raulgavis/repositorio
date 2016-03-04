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

    public Rombo(){                 /**Constructor sin parámetros o constructor general */
        this.setdMayor(1.0);
        this.setdMenor(1.0);
    }   
    public Rombo(double dMayor, double dMenor){     /**Método constructor con parámetros; Éste método necesita que definamos dos métodos nuevos más para pasar los parámetros*/ 
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

   public double getArea(){ 
        return this.getdMayor() * this.getdMenor()/2.0;
    }
    public double getPerimetro(){
        double lado = Math.sqrt(Math.pow(getdMayor(),2)/2.0+Math.pow(getdMenor(),2)/2.0);  
        return lado * 4;
    }
}  

