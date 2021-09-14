package revisão_2;

import javax.swing.JOptionPane;

public class ter_3 {
static void maior(){
double n1,n2;
n1=Double.parseDouble(JOptionPane.showInputDialog("digite o 1° num: "));
n2=Double.parseDouble(JOptionPane.showInputDialog("digite o 2° num: "));
JOptionPane.showMessageDialog(null, "o maior num é: "+Math.max(n1, n2));
}
    public static void main(String[] args) {
maior();
 }}
