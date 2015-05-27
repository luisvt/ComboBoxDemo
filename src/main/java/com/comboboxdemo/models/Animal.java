/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comboboxdemo.models;

import net.jhorstmann.propertychangesupport.api.PropertyChangeSupport;

/**
 *
 * @author luis
 */
@PropertyChangeSupport
public class Animal {
    private String name;
    private String picture;
    
    public Animal() {}

    public Animal(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
