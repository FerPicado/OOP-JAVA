
package constantes;


public class Person {
    
    private final String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // metodo para mostrar datos:
    
    public void showInformation() {
        System.out.println("Mi nombre es " + name + ", y tengo " + age + " anios.");
    }
    
    //setter
    public void setAge(int age) {
        this.age = age;
    }
    
    //getter
    public int getAge() {
        return age;
    }
}
