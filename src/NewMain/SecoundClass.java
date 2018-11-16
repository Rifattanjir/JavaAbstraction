/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewMain;

/**
 *
 * @author Rifat
 */
public class SecoundClass extends FirstClass {

    @Override
    public void display1() {
        System.out.println("Creating Display 1.");
    }
    
    public static void main(String[] args) {
        // Reference by FirstClass
//        FirstClass obj = new SecoundClass();
        // Reference by SecoundClass
        SecoundClass obj = new SecoundClass();
        obj.display1();
        obj.display2();
    }
}
