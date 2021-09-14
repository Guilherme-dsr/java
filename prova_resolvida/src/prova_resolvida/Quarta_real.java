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
public class Quarta_real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salf, taven, bo, tosal, por;
        salf=Double.parseDouble(JOptionPane.showInputDialog("digite o salario fixo"));
        taven=Double.parseDouble(JOptionPane.showInputDialog("digite o total de carros vendidos"));
        bo= taven*50;
        por= (taven*100)/5;
        tosal= salf+por;
        JOptionPane.showMessageDialog(null,"seu salario total é: "+tosal);
        // TODO code application logic here
    }
    
}
