/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Rifat
 */
public class Bike extends Car {
    
    @Override
    public void topspeed(){
        System.out.println("Bike Top Speed 200");
    }
    
    public static void main(String[] args) {
        Car obj = new Bike();
        obj.topspeed();   
    }
}
