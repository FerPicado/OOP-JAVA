package constantes;

public class main {

    public static void main(String[] args) {
        Person personOne = new Person("Fernando Alonso", 41);
        personOne.showInformation();

        personOne.setAge(42);

        personOne.showInformation();

    }
}
