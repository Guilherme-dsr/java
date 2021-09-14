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
public class segunda_questão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km, ms;
        km=Double.parseDouble(JOptionPane.showInputDialog("digite a velocidade em km/h"));
        ms= km/3.6;
        JOptionPane.showMessageDialog(null, "a velocidade em ms é: "+ms);
        
        
        // TODO code application logic here
    }
    
}
