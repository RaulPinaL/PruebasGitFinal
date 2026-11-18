import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {

        System.out.println("hola mundo");
        System.out.println(restar(5, 2));
        System.out.println(suma(5, 2));
        System.out.println(division(16, 4));
    }
    private static int suma(int a, int b){
       return a + b;

    }

    private static int restar(int a, int b) {
        return a - b;
    }
    private static int division(int a, int b) {
        return a / b;

    }

}
