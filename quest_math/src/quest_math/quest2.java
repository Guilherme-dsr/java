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
public class quest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double n1;
       n1=Double.parseDouble(JOptionPane.showInputDialog("digite o numero: "));
       JOptionPane.showMessageDialog(null, "o valor inteiro anterior e:" +Math.floor(n1));
        // TODO code application logic here
    }
    
}
