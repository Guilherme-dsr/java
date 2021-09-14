/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class primera_quest63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
       op=Integer.parseInt(JOptionPane.showInputDialog("RONEY NO PUTERO \n "
           + "1:produtos de limpaza COM VEA DE QUATRO\n"
           + "2:cu de vea do roney\n"
           + "3:come vea de+\n"
       ));
        switch(op){
        case 1:;
            JOptionPane.showMessageDialog(null,"produtos de limpaza COM VEA DE QUATRO ");
        break;
        case 2:;
            JOptionPane.showMessageDialog(null,"cu de vea do roney");
        break;
        case 3:;
            JOptionPane.showMessageDialog(null,"come vea de+");
        break;
        
        default: JOptionPane.showMessageDialog(null,"essA vea não existe: ");
        // TODO code application logic here
    }}}
    

