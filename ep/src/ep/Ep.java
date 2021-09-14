/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 07
 */
public class Ep {
static void pessoa (){
String nome, n;
int fone, idade;

nome=JOptionPane.showInputDialog("digite o seu nome");
n=JOptionPane.showInputDialog("digite o seu endereço");
fone=Integer.parseInt(JOptionPane.showInputDialog("digite o seu número de telefone"));
idade=Integer.parseInt(JOptionPane.showInputDialog("digite a sua idade"));


if(idade>=18){JOptionPane.showMessageDialog(null,"nome: "+nome+"\n endereço: "+n+"\n telefone: "+fone+"\n idade: "+idade+ "\n você pode assistir o filme ");}
else{ JOptionPane.showMessageDialog(null, "sai daqui criança");}



}
        

    public static void main(String[] args) {
      pessoa();
    }
    
}
