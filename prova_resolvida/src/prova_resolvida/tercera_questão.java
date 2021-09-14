/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_resolvida;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class tercera_questão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n;
        n=Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
        if(n<=10){
        JOptionPane.showMessageDialog(null, "f1");
        // TODO code application logic here
        }else if(n>10 && n<=100){
        JOptionPane.showMessageDialog(null, "f2");
        }else{
        JOptionPane.showMessageDialog(null, "f3");
        }
    
    
   
    
    
}
    
}
