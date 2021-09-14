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
public class quest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, soma;
        n1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        soma=  n1+n2;
        JOptionPane.showMessageDialog(null, "o quadrado da soma é: " +Math.pow(soma,2));
        
        // TODO code application logic here
    }
    
}
