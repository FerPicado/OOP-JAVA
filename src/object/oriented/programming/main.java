package object.oriented.programming;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        //Operacion_oop operation = new Operacion_oop();

        /* operation.readNumbers();
        operation.sumar();
        operation.restar();
        operation.multiplicar();
        operation.dividir();
        operation.results(); */
        //cargar datos
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("First number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Second number: "));

        Params_arguments paramsArguments = new Params_arguments();
        
        paramsArguments.sumar(n1,n2);
        paramsArguments.restar(n1,n2);
        paramsArguments.multiplicar(n1, n2);
        paramsArguments.dividir(n1,n2);
        paramsArguments.results();

    }
}
