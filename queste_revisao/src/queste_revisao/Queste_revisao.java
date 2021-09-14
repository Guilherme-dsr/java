/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queste_revisao;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class Queste_revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anon, anoa, idade;
        anon=Integer.parseInt(JOptionPane.showInputDialog("digite seu ano de nascimanto"));
        anoa=Integer.parseInt(JOptionPane.showInputDialog("digite o ano atual"));
        idade=anoa-anon;
        if(idade>=18){
        JOptionPane.showMessageDialog(null," voce e maior de idade e pode ser preso " +idade);
        }else{
         JOptionPane.showMessageDialog(null," voce e menor éeééeé " +idade);}

        // TODO code application logic here
    }
    
}
