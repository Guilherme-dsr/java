/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ala;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 07
 */
public class Ala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double n1, n2 ;
    int op;
     
    n1=Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
    JOptionPane.showMessageDialog(null,"1 soma, 2 subtrai, 3 divide 4 multiplica");
    op=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
    switch(op){
        case 1:;
         JOptionPane.showMessageDialog(null,"o resultado da soma é" +(n1 + n2));
         break;
        case 2:;
        JOptionPane.showMessageDialog(null,"o resultado da subtrair é" + (n1 - n2));
        break;
        case 3:;
        JOptionPane.showMessageDialog(null,"o resultado da divisao é" + (n1/n2));
        break;
        case 4:;
        JOptionPane.showMessageDialog(null,"o resultado da multiplicacao é" + (n1 * n2));
        break;
        default: JOptionPane.showMessageDialog(null,"t0789u6jmn4");
        
        
    }
    
    
       
        // TODO code application logic here
    }
    
}
