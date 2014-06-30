/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio10;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        int x,y,sumaResiduo=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número","Número Inicial",JOptionPane.QUESTION_MESSAGE));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese otro número","Número Final",JOptionPane.QUESTION_MESSAGE));
         
        for (int i = x; i <= y; i++) {
            sumaResiduo=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    sumaResiduo =sumaResiduo+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    sumaResiduo=0; 
                }
            }
            if (sumaResiduo==i) {
                JOptionPane.showMessageDialog(null, "El primer número perfecto ente "+ x+" y "+y+ " es = " +sumaResiduo);
                i=y;
            }
        }
            if(sumaResiduo==0) {
                JOptionPane.showMessageDialog(null, "no hay números perfectos ente "+ x+" y "+y);
            }
    }
}
