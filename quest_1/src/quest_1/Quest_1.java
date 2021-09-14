package quest_1;

import javax.swing.JOptionPane;

public class Quest_1 {

    public static void main(String[] args) {
int a,b,mu;
a=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
b=Integer.parseInt(JOptionPane.showInputDialog("digite outro numero: "));
mu=(a*b)/a;
if(mu==0){
JOptionPane.showMessageDialog(null, "esse numero é multiplo");
}else{
JOptionPane.showMessageDialog(null, "esse numero não é multiplo"); 
}}}
