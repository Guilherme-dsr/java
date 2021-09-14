
package exercicio.pkg0901;

import java.util.Random;
import javax.swing.JOptionPane;


public class Exercicio0901 {

    public static void main(String[] args) {
        String nome;
        nome=JOptionPane.showInputDialog( "nome de usuario");
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(88888888);
        JOptionPane.showMessageDialog(null,"usuario: "+nome+"\n"+"senha: "+ numero);

    
}}
