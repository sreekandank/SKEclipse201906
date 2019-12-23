package com.sk.spring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
 
public class Tiger {
     
    private String name;
 
    private Color color;
         
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Color getColor() {
        return color;
    }
 
    @Autowired
    public void setColor(Color color) {
        this.color= color;
    }
     
    @Override
    public String toString() {
        return "The " + name + " has " + color.toString();
         
    }
}