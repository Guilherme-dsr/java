/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opera;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class Opera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        a=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de a:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de b:"));
        c=Integer.parseInt(JOptionPane.showInputDialog("digite o valor de c:"));
        
        JOptionPane.showMessageDialog(null," operadores logicos");
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a == b && b > c ));
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a != b || b < c ));
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a > b ));
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a < b && b > c ));
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a >= b || b == c ));
        JOptionPane.showMessageDialog(null,"\n" + a + "==" + b + "e b>c" + "\t" +(a <= b ));
        
        // TODO code application logic here
    }
    
}
