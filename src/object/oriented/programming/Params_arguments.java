package object.oriented.programming;

public class Params_arguments {

    int sum, resta, multp, divs;

    //methods

    public void sumar(int num, int num_two) {
        sum = num + num_two;
    }

    public void restar(int num, int num_two) {
        resta = num - num_two;
    }

    public void multiplicar(int num, int num_two) {
        multp = num * num_two;
    }

    public void dividir(int num, int num_two) { //orange = parametros
        divs = num / num_two;
    }

    public void results() {
        System.out.println("El resultado de la suma es: " + sum);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multp);
        System.out.println("El resultado de la divicion es: " + divs);
    }
}
