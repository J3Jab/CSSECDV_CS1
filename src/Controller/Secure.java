/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author j3jab
 */
public class Secure {
    
    public Secure(){
        javax.swing.JTextField test = new javax.swing.JTextField();
        test.setText("");
    }
    
    public void clearTextFld(javax.swing.JTextField field){
        field.setText("");
    }
    
    public boolean chkIfSame(String first, String second){
        return(first.equals(second));
    }
}
