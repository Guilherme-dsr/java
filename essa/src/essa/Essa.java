/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essa;

import javax.swing.JOptionPane;


public class Essa {
    static void  subtrair(){
    double n1, n2,  r;
    
    n1=Double.parseDouble(JOptionPane.showInputDialog("digite um número"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("digite outro número"));
    r= (n1-n2);
    JOptionPane.showMessageDialog(null,"o resultado da subtração é:"+r);
    }
    static void  somar(){
    double n1, n2,  r;
    n1=Double.parseDouble(JOptionPane.showInputDialog("digite um número"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("digite outro número"));
    r= (n1+n2);
    JOptionPane.showMessageDialog(null,"o resultado da soma é:"+r);
    }
    static void  div(){
    double n1, n2,  r;
    n1=Double.parseDouble(JOptionPane.showInputDialog("digite um número"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("digite outro número"));
    r= (n1/n2);
    JOptionPane.showMessageDialog(null,"o resultado da divisão é:"+r);
    }
    static void  mut(){
    double n1, n2,  r;
    n1=Double.parseDouble(JOptionPane.showInputDialog("digite um número"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("digite outro número"));
    r= (n1*n2);
    JOptionPane.showMessageDialog(null,"o resultado da multiplicação é: "+r);
    }
    
    public static void main(String[] args) {
     subtrair ();   
     somar ();
     div();
     mut();
     
        
    }
    
}
