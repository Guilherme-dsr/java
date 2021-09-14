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
public class quest6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double volume, lado;
        lado=Double.parseDouble(JOptionPane.showInputDialog(null,"digite o lado: "));
        volume= lado*lado*lado;
        JOptionPane.showMessageDialog(null, "sua caixa suporta: " +Math.floor(volume));
        
        
        // TODO code application logic here
    }
    
}
