/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_revis3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 06
 */
public class Quest_revis3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x=Integer.parseInt(JOptionPane.showInputDialog("digite um lado do triangulo "));
        y=Integer.parseInt(JOptionPane.showInputDialog("digite outro lado do triangulo "));
        z=Integer.parseInt(JOptionPane.showInputDialog("digite mais um lado do triangulo "));
      if(x == y && y==z){
         JOptionPane.showMessageDialog(null, " equilátero ");
      }else if(x == y && y != z || x == z && z !=y){
         JOptionPane.showMessageDialog(null, " isóscele ");
      }else if(x != y && y != z){
         JOptionPane.showMessageDialog(null, " escaleno ");
      }else{
         JOptionPane.showMessageDialog(null, " esse triangulo não é nem um dos anteriores ");
      }
      }
      } 
      
      
        // TODO code application logic here
    
    

