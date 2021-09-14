package revisão_2;
import javax.swing.JOptionPane;
public class Revisão_2 {
static void diga(){
double nu;
nu=Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
if(nu>0){
JOptionPane.showMessageDialog(null, "o numero não é nulo: "+nu);
}else{
JOptionPane.showMessageDialog(null, "o numero é nulo: "+nu);
}}
public static void main(String[] args) {
diga();   
}}
