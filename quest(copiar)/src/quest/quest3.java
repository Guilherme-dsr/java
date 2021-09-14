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
public class quest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b;
        a=Double.parseDouble(JOptionPane.showInputDialog("digite o 1° numero: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("digite o 2° numero: "));
        JOptionPane.showMessageDialog(null, "o numero anterior é: " +Math.floor(a)); 
        
        // TODO code application logic here
    }
    
}
