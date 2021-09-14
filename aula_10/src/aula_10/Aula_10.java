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
public class Aula_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo= null;
        int op;
        op=Integer.parseInt(JOptionPane.showInputDialog("digite o numero do seu presidente: "));
        switch(op){
            case 17: titulo="melhor opção: ";
            JOptionPane.showMessageDialog(null, "o bolsonaro é o melhor do mundo"+titulo );
        break;
        case 13: titulo="você é burro: ";
            JOptionPane.showMessageDialog(null, "lixoooo"+titulo);
        break;
        case 12: titulo="você é burro: ";
            JOptionPane.showMessageDialog(null, "lixoooo"+titulo);
        break;
        default: JOptionPane.showMessageDialog(null, "esse presidente não presta: "+op);
        
            
        }
        // TODO code application logic here
    }
    
}
