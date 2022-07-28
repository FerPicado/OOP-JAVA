package object.oriented.programming;

import javax.swing.JOptionPane;

public class Operacion_oop {

    int number_one, number_two, sum, resta, multp, divs;

    //methods
    public void readNumbers() {
        number_one = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        number_two = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el otro numero: "));
    }

    public void sumar() {
        sum = number_one + number_two;
    }

    public void restar() {
        resta = number_one - number_two;
    }

    public void multiplicar() {
        multp = number_one * number_two;
    }

    public void dividir() {
        divs = number_one / number_two;

    }

    public void results() {
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multp);
        System.out.println("El resultado de la divicion es: " + divs);
    }
}
