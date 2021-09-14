package revisão_2;
import javax.swing.JOptionPane;
public class quar_4 {
static void min(){
double n1,n2;
n1=Double.parseDouble(JOptionPane.showInputDialog("digite o 1° num: "));
n2=Double.parseDouble(JOptionPane.showInputDialog("digite o 2° num: "));
JOptionPane.showMessageDialog(null, "o menor num é: "+Math.min(n1, n2));
}
public static void main(String[] args) {
min();   
}}
