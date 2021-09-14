/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swit;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class Swit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
        switch(op){
        case 1:;
        JOptionPane.showMessageDialog(null, "Alimento não perecivel");
        break;
        case 2:;
        JOptionPane.showMessageDialog(null, "Alimento perecivel");
        break;
        case 3:;
        JOptionPane.showMessageDialog(null, "Alimento perecivel");
        break;
        case 4:;
        JOptionPane.showMessageDialog(null, "Alimento perecivel");
        break;
        case 5:;
        JOptionPane.showMessageDialog(null, "vestuario");
        break;
        case 6:;
        JOptionPane.showMessageDialog(null, "vestuario");
        break;
        case 7:;
        JOptionPane.showMessageDialog(null, "higiene pessoal");
        break;
        case 8:case 9: case 10: case 11: case 12: case 13: case 14: case 15:; 
        JOptionPane.showMessageDialog(null, "Limpeza e Utensílios Domésticos");
        break;
      
        default:JOptionPane.showMessageDialog(null, "codigo invalido");
            
     
        
       
        
        
        // TODO code application logic here
    }}
    
}
