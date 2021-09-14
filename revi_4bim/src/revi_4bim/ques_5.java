
package revi_4bim;

import javax.swing.JOptionPane;

public class ques_5 {

    public static void main(String[] args) {
String num="", numve="";
int i;
Integer vet []=new Integer[10];
for(i=0;i<vet.length;i++){
num=JOptionPane.showInputDialog("digite um numero");
vet[i]=Integer.parseInt(num);
}
JOptionPane.showMessageDialog(null, "voce digitou: ");
JOptionPane.showMessageDialog(null, vet);   
for(i=vet.length-1;i>=0;i--){
numve+=vet[i];
}
JOptionPane.showMessageDialog(null, "numero de tras pra frente: ");
JOptionPane.showMessageDialog(null, numve);
}}
