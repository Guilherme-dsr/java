package swit;

import javax.swing.JOptionPane;

public class quest4 {
    public static void main(String[] args) {
    int op,qt;
    double c,bu,bo,h,ch,r;
    op=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo\n"
    +"100 cachorro quente R$ 1,70\n"
    +"101 Bauru Simples R$ 2,30 \n"
    +"102 Bauru com ovo R$ 2,60\n"
    +"103 Hamburguer R$ 2,40 \n"
    +"104 Cheeseburguer R$ 2,50 \n"
    +"105 Refrigerante R$ 1,00\n"));
    qt=Integer.parseInt(JOptionPane.showInputDialog("quantidade "));
    c=1.70;
    bu=2.30;
    bo=2.60;
    h=2.40;
    ch=2.50;
    r=1.00;
    switch(op){
        case 100:;
        JOptionPane.showMessageDialog(null, "o preço é" +"R$"+(qt*c));
    break;
    case 101:;
        JOptionPane.showMessageDialog(null, "o preço é: " +"R$"+(qt*bu));
    break;
    case 102:;
        JOptionPane.showMessageDialog(null, "o preço é: " +"R$"+(qt*bo));
    break;
    case 103:;
        JOptionPane.showMessageDialog(null, "o preço é: " +"R$"+(qt*h));
    break;
    case 104:; 
        JOptionPane.showMessageDialog(null, "o preço é: " +"R$"+(qt*ch));
    break;
    case 105:;
        JOptionPane.showMessageDialog(null, "o preço é: " +"R$"+(qt*r));
    break;
    default:JOptionPane.showMessageDialog(null, "nao exite");
    
    }}}
