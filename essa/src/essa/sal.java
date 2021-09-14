
package essa;

import static essa.Essa.div;
import static essa.Essa.mut;
import static essa.Essa.somar;
import static essa.Essa.subtrair;
import javax.swing.JOptionPane;



public class sal {
        static void  tp(){
    int ok;
   
    ok=Integer.parseInt(JOptionPane.showInputDialog("você deseja:\n 1.multiplicar \n 2.somar \n 3.subtrair\n 4.dividir" ));
    
    if(ok==1){
     mut(); 
        }
    
    else if(ok==2){ 
    somar();
    }
    else if(ok==3){
        subtrair ();
        }
    else if (ok==4){
        div();
        }
    else {
    JOptionPane.showMessageDialog(null, "tu ta na disney man");}
        }
    public static void main(String[] args) {
    tp();
    }
    
}
