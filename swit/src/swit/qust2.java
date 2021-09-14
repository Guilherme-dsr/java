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
public class qust2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2;
        int op;
        n1=Double.parseDouble(JOptionPane.showInputDialog("digite o numero"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("digite o numero"));
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
        switch(op){
        case 1:;
        JOptionPane.showMessageDialog(null, "a media é" +(n1+n2)/2);
        break;
        case 2:;
        JOptionPane.showMessageDialog(null, "os numeros sao diferentes" +(n1!=n2));
        break;
        case 3:;
        JOptionPane.showMessageDialog(null, "o produto é" +(n1*n2));
        break;
        case 4:;
        JOptionPane.showMessageDialog(null, "a divisao é " +(n1/n2));
        break;
        default:JOptionPane.showMessageDialog(null, "este codigo nao exite");
        
        // TODO
        
    }}
    
}
