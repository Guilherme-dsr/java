package revi_4bim;

import javax.swing.JOptionPane;

public class Revi_4bim {

public static void main(String[] args) {
double f;
int n;
JOptionPane.showMessageDialog(null, "101-Raiz quadrada \n 102-metade \n 103-10% \n 104-dobro");
n=Integer.parseInt(JOptionPane.showInputDialog("digite o código"));
f=Double.parseDouble(JOptionPane.showInputDialog("digite o seu numero"));
switch(n){
    case 101: 
        JOptionPane.showMessageDialog(null, "Raiz quadrada é:"+Math.sqrt(f) );
        break;
    case 102: JOptionPane.showMessageDialog(null, "a metade é:"+(f/2));
    break;
    case 103:  JOptionPane.showMessageDialog(null, "a porcentagem é:"+(f*10/100));
    break;
    case 104:  JOptionPane.showMessageDialog(null, "o dobro é: "+(f*2) );
    break;
    default:  JOptionPane.showMessageDialog(null, "código inválido");
}

}}
