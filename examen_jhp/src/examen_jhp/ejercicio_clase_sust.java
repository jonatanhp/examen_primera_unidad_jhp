/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_jhp;

/**
 *
 * @author Laboratorio 7
 */
import java.util.*;
import javax.swing.*;
public class ejercicio_clase_sust {
    static Scanner leer=new Scanner(System.in);
    public static void promedio_notas(){
        
    }
    
    
    public static void main(String[]args){
        int may=0;
        int men=20;
        double prom=0;
        int suma=0;
        for(int i=1;i<6;i++){
        int nota=Integer.parseInt(JOptionPane.showInputDialog("introduzca la nota"+i));
                if (nota>may){
                may=nota;
               
                }
                if(nota<men){
                men=nota;
                }
                suma=suma+nota;
        }
        prom=suma/5; 
        
        
        JOptionPane.showMessageDialog(null, "la nota mayor es: "+may);
        JOptionPane.showMessageDialog(null, "la menor nota es: "+men);
        JOptionPane.showMessageDialog(null, "la menor promedio es: "+prom);
        
        
    
    }
    
}
