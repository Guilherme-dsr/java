package atv_fix;


import javax.swing.JOptionPane;

public class Atv_fix {
static void ven(){
double vend;
int op;
vend=Double.parseDouble(JOptionPane.showInputDialog("digite o preço total da venda: "));
op=Integer.parseInt(JOptionPane.showInputDialog(null, " 1: Venda a Vista - desconto de 10%\n" +
" 2: Venda a Prazo 30 dias - desconto de 5%\n" +
" 3: Venda a Prazo 60 dias - mesmo preço\n" +
" 4: Venda a Prazo 90 dias - acréscimo de 5%\n" +
" 5: Venda com cartão de débito - desconto de 8%\n" +
" 6: Venda com cartão de crédito - desconto de 7%"));
switch(op){
    case 1:
JOptionPane.showMessageDialog(null, "Total: "+(vend*90)/100);
break;
    case 2:
JOptionPane.showMessageDialog(null, "Total: "+(vend*95)/100);
break;
    case 3:
JOptionPane.showMessageDialog(null, "Total: "+vend);
break;
    case 4:
JOptionPane.showMessageDialog(null, "Total: "+(vend*105)/100);
break;
    case 5:
JOptionPane.showMessageDialog(null, "Total: "+(vend*92)/100);
break;
    case 6:
JOptionPane.showMessageDialog(null, "Total: "+(vend*93)/100);
default:JOptionPane.showMessageDialog(null, "não");

}}
public static void main(String[] args) {
ven();


}}
