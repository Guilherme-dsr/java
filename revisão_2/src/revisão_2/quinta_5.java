package revisão_2;

import java.util.Random;
import javax.swing.JOptionPane;
public class quinta_5 {
static void dado(){
Random dado = new Random();
JOptionPane.showMessageDialog(null, dado.nextInt(6));
}
public static void main(String[] args) {
dado();
}}