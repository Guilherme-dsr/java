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
public class quarta_quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2;
        n1=Double.parseDouble(JOptionPane.showInputDialog("digite a velocidade em km/h"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("digite a velocidade em km/h"));
        if(n1==n2){
        JOptionPane.showMessageDialog(null,"numeros iguais");
        }else if(n1>n2){
        JOptionPane.showMessageDialog(null,"o primero é maior");
        }else if(n2>n1){
        JOptionPane.showMessageDialog(null,"o segundo numero é maior");
        }
        // TODO code application logic here
    }
    
}
