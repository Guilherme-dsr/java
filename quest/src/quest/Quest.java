/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class Quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, soma, mult, sub, div;
        a=Double.parseDouble(JOptionPane.showInputDialog("digite o primero valor: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor: "));
        soma= a + b;
        mult= a * b;
        div= a / b;
        JOptionPane.showMessageDialog(null, "a soma é: " +soma);
        JOptionPane.showMessageDialog(null, "a multipicação é: " +mult);
        JOptionPane.showMessageDialog(null, "a divisão é: " +div);
        
        // TODO code application logic here
    }
    
}
