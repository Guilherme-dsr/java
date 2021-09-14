/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaif;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 11
 */
public class Aulaif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double media, a, b;
     a=Double.parseDouble( JOptionPane.showInputDialog("digite sua 1° nota"));
    b=Double.parseDouble( JOptionPane.showInputDialog("digite sua 1° nota"));
    media=(a+b)/2;
        if (media>=6){
            JOptionPane.showMessageDialog(null,"aluno aprovado");
             }else if (media<6){
            JOptionPane.showMessageDialog(null,"aluno de recuperação");
             }else 
        JOptionPane.showMessageDialog(null,"aluno reprovado rarara");
        
    
    
    
    
    
    
    }
    }

