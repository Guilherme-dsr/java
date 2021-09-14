package revisão_2;


import javax.swing.JOptionPane;

public class seti_7 {
public static void main(String[] args) {
int[][] matriz = new int[5][5];
int i,c;
for (i = 0; i < matriz.length; i++) {
for ( c = 0; i <matriz.length; i++) {
matriz[i][c]=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
}}

for (i = 0; i < matriz.length; i++) {
for ( c = 0; i < 5; i++) {
JOptionPane.showMessageDialog(null,matriz[i][c]);
}}

}}