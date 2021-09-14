/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_math;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class quest5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("digite o numero: "));
        JOptionPane.showMessageDialog(null, "o valor minimo é:" +Math.min(n1, n2));
        // TODO code application logic here
    }
    
}
