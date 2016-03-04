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
public class Rectangulo {
//<editor-fold defaultstate="collapsed" desc="Atributos/Campos (Estado)">
    private double base;
    private double height;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Métodos (Comportamientos)">
//<editor-fold defaultstate="collapsed" desc="getters/setters">
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        if (base<=0.0)
            throw new IllegalArgumentException("Argumento no válido");
        else
            this.base = base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        if (height<=0.0)
            throw new IllegalArgumentException("Argumento no válido");
        else
            this.height = height;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="constructores">
public Rectangulo(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Métodos de los objetos">
 public double getArea(){
     return this.getBase() * this.getHeight();
 }
 public double getPerimeter(){
     return this.getBase()*2 + this.getHeight()*2;
 }
//</editor-fold>
//</editor-fold>    

    


}
