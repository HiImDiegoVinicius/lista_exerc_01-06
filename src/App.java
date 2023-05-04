import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Raio do Circulo: ");    
         double raio = input.nextDouble();
         input.close();
         double area = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + area); 

    }
}
