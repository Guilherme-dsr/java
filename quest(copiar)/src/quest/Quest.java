/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2;
        n1=Double.parseDouble(JOptionPane.showInputDialog("digite o 1° numero: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("digite o 2° numero: "));
        JOptionPane.showMessageDialog(null, "o maior numero é: " +Math.max(n1, n2));
        JOptionPane.showMessageDialog(null, "o menor numero é: " +Math.min(n1, n2));
        // TODO code application logic here
    }
    
}
