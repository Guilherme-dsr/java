
package revi_4bim;

import javax.swing.JOptionPane;


public class NewClass {
    public static void main(String[] args) {
        int  c;
        double p;
        JOptionPane.showMessageDialog(null, "1-Sul \n 2-Norte \n 3-Leste \n 4-Oeste \n 5 ou 6-Nordeste");
        c=Integer.parseInt(JOptionPane.showInputDialog("digite o código de origem"));
        p=Double.parseDouble(JOptionPane.showInputDialog("digite o valor do produto"));
        switch(c){
    case 1: 
        JOptionPane.showMessageDialog(null,"R$"+p+"-Sul" );
        break;
    case 2: JOptionPane.showMessageDialog(null,"R$"+p+"-Norte");
    break;
    case 3:  JOptionPane.showMessageDialog(null, "R$"+p+"Leste");
    break;
    case 4:  JOptionPane.showMessageDialog(null, "R$"+p+"-Oeste" );
    break;
    case 5: case 6: JOptionPane.showMessageDialog(null, "R$"+p+"-Nordeste" );
    break;
    default:  JOptionPane.showMessageDialog(null, "código inválido");
        
    }
    
    }}
