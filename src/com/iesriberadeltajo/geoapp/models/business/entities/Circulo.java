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
public class Circulo {
//<editor-fold defaultstate="collapsed" desc="Atributos/Campos (Estado)">
    private double radius;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Métodos (Comportamientos)">
    //<editor-fold defaultstate="collapsed" desc="setters/getters">
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (radius<=0.0)
            throw new IllegalArgumentException("Argumento no válido");
        else
            this.radius = radius;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructores">
    public Circulo(double radius) {
        this.setRadius(radius);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Métodos de los objetos">
 public double getArea(){
     return Math.PI * Math.pow(this.getRadius(),2);
 }
 public double getPerimeter(){
     return Math.PI * 2 * this.getRadius();
 }
//</editor-fold>
//</editor-fold>   

    

   
    
}
