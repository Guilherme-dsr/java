/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILHERME
 */
public class prov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        JOptionPane.showMessageDialog(null, "pesquisa para presidencia 2018");
        op=Integer.parseInt(JOptionPane.showInputDialog("digite o numero do seu candidato \n"+"17 bolsonaro\n"+"12 ciro gomes\n"+"13 adade\n"));
        switch(op){
            case 17:;
            JOptionPane.showMessageDialog(null, "votação concluida boa :)"+op);
            break;
            case 12:;
            JOptionPane.showMessageDialog(null, "votação concluida pessimo :.("+op);
            break;
            case 13:;
            JOptionPane.showMessageDialog(null, "votação concluida pessimo estude mas ;0"+op);
            break;
            default: JOptionPane.showMessageDialog(null, "esse não existe :( "+op);
            
        
        }}
        // TODO code application logic here
    }
    

