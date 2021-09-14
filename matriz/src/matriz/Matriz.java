/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 07
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabela [] []=new int [2][2];
        tabela[0][0]=12;
        tabela[1][0]=21;
        tabela[0][1]=26;
        tabela[1][1]=45;
        
        JOptionPane.showMessageDialog(null, tabela [0] [0]+"\n"+tabela [1] [0]+"\n"+tabela [0] [1]+"\n"+tabela [1] [1]+"\n");

        
       
    }
    
}
