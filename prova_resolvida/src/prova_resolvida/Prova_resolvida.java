/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_resolvida;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Aluno 06
 */
public class Prova_resolvida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vol, lar, com, altu;
        lar=Double.parseDouble(JOptionPane.showInputDialog("digite a largura"));
        com=Double.parseDouble(JOptionPane.showInputDialog("digite o comprimento"));
        altu=Double.parseDouble(JOptionPane.showInputDialog("digite a altura"));
        vol=com*lar*altu;
        JOptionPane.showMessageDialog(null, "o volume da caixa é: "+vol);
                
        // TODO code application logic here
    }
    
}
