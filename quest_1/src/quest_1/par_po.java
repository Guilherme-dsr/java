package quest_1;

import javax.swing.JOptionPane;

public class par_po {

    public static void main(String[] args) {
int n,va;
n=Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
va=n%2;
if(va==0){
JOptionPane.showMessageDialog(null, "esse numero é par: "+n);
if(n>0){
JOptionPane.showMessageDialog(null, "o numero é positivo: "+n);
}
else{
JOptionPane.showMessageDialog(null, "o numero é negativo: "+n);}
}else{
JOptionPane.showMessageDialog(null, "esse numero é impar: "+n);
if(n>0){
JOptionPane.showMessageDialog(null, "o numero é positivo: "+n);
}
else{
JOptionPane.showMessageDialog(null, "o numero é negativo: "+n);}
}}}
