/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for__;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILHERME
 */
public class do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("digite um numero "));
        while(n2 != 0){
        JOptionPane.showMessageDialog(null, "o resultado da divisão é " +(n1/n2));}
        while(n2 ==0){
        JOptionPane.showInputDialog("digitte um numero diferente de zero");
        }
        
    }}
        
        
        
            
        
        // TODO code application logic here
    
    

