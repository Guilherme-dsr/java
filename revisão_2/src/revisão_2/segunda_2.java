package revisão_2;

import javax.swing.JOptionPane;

public class segunda_2 {
static void bas(){
double a, b, c, delta;
a=Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor de a: "));
b=Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor de b: "));
c=Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor de c: "));
delta=(b*b)-4*a*c;
JOptionPane.showMessageDialog(null, "o delta é: "+delta);
}
    public static void main(String[] args) {
bas();
}}
    
