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
//importamos las clases que no están cargadas y que vamos a usar
import java.util.*;
import javax.swing.*;
//cada ejercicio se ralizó dentro de un método public static void y será llamado desde el main

public class Examen_jhp {
//creamos el objeto para poder usar la herramienta scanner
static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void ejercicio1_jhp(){
    //Introducimos los datos necesarios para el problema con una ventana JOptionPane
    int numdias=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de días:"));
    int costhotel=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo del hotel:"));
    int costcomida=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo de la comida"));
    
    //realizamos la operación para determinar el total 
   int total=numdias*(costcomida+costhotel+100);
   //mostramos el resultado en una ventana similar
    JOptionPane.showMessageDialog(null, "el total del chque para "+numdias+" días es igual a: "+total);
    }
    public static void ejercicio2_jhp(){
        //ingresamos los datos
        int tiempo=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de años que lleva en la empresa:"));
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese su sueldo:"));
        double bono=0;
        //usamos el condicional if else usando el conector lógico "o"
        if(tiempo>4 || sueldo<2000 ){
            bono=0.25*sueldo;
        }else{
        bono=0.2*sueldo;
        }
        JOptionPane.showMessageDialog(null, "la cantidad que le corresponde de bono navideño es de: "+bono);
    }
   
    
    
    public static void ejercicio3_jhp(){
    int men;
    int med;
    int may;
System.out.println("introduzca el primer número");
int num1=leer.nextInt();
System.out.println("introduzca el segundo número");
int num2=leer.nextInt();
System.out.println("introduzca el tercer número");
int num3=leer.nextInt();
//el algoritmo se realizo contemplando todas las combinaciones puesto a que solo se usan 3 variables
//por lo tanto se puede hacer uso de la estructura if anidada sin que sea tan largo
//en cada caso se ve si el numero es el mayor de todos y luego se ve cual de ellos es el del medio y el q sobra es el menor
if(num1>num2 && num1>num3){
    may=num1;
    if(num2>num3){
        med=num2;
        men=num3;
    }else{
        med=num2;
        men=num3;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es "+men);
}
if(num2>num1 && num2>num3){
    may=num2;
    if(num1>num3){
        med=num1;
        men=num3;
    }else{
        med=num3;
        men=num1;
    }
    System.out.print("el numero mayor es: "+may+" el numero medio es:"+med+" el numero menor es: "+men);
}
if(num3>1 && num3>num2){
    may=num3;
    if(num2>num1){
        med=num2;
        men=num1;
    }else{
        med=num1;
        men=num2;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es:"+men);
}
 
    }
    //los demás comentarios no se pueden realizar debido a la falta de tiempo, en caso de ser necesario se podría hacer un comentario 
    //de manera hablada
    public static void ejercicio4_jhp(){
        String num1=JOptionPane.showInputDialog("introduzca el primer número");
        String num2=JOptionPane.showInputDialog("introduzca el segundo número");
        double num1d=Double.parseDouble(num1);
        double num2d=Double.parseDouble(num2);
        String signo=JOptionPane.showInputDialog("introduzca el signo de la operación que quiere realizar");
        double resultado=0;
        if (signo.equals("+")){
            resultado=num1d+num2d;}
        else if(signo.equals("-")){
            resultado=num1d-num2d;
        
        }
        else if(signo.equals("*")){
            resultado=num1d*num2d;}
        else{
        resultado=num1d/num2d;
        }
        JOptionPane.showMessageDialog(null, "el resultado de la operación es: "+resultado);
    }
    
    public static void ejercicio5_jhp(){
        String salario=JOptionPane.showInputDialog("introduzca el salario ");
        double salariod=Double.parseDouble(salario);
        int años=Integer.parseInt(JOptionPane.showInputDialog("introduzca la cantidad de años"));
        double acum=1;
        
        for (int i=2;i<años;i++){
            salariod=salariod+(salariod*0.1);
            acum=salariod+(salariod*0.1);
            
        }
        JOptionPane.showMessageDialog(null, "la cantidad de sueldo que ha recibido en "+años+" años es "+acum);
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        int ejercicio=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de ejercicio que desea probar"));
        
        switch (ejercicio){
            case 1:{ejercicio1_jhp();}break;
            case 2:{ejercicio2_jhp();}break;
            case 3:{ejercicio3_jhp();}break;
            case 4:{ejercicio4_jhp();}break;
            case 5:{ejercicio5_jhp();}break;
            default:{JOptionPane.showMessageDialog(null, "opción no válida");}
        }
        
    }
    }

   
    
