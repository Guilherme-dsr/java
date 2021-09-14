
package exercicio.pkg0901;

import java.util.Random;
import javax.swing.JOptionPane;


public class Ecercicio {


    public static void main(String[] args) {
        String lista[] = new String[5];
        Random r=new Random();
        int ra= r.nextInt(lista.length);
        
        for(int i=0; i<lista.length;i++){
        lista[i]=JOptionPane.showInputDialog("digite um name:");
        }
        JOptionPane.showMessageDialog(null, "o sortudo foi:\n"+ lista[ra]);
    
    }}
