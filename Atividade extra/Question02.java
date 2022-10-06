import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número maior que 0: ");
        numero = scan.nextInt();

        while (numero >= 0) {
            if (numero % 2 == 0) {
                System.out.println("É PAR!!");
            } else {
                System.out.println("É IMPAR!!");
            }
            numero = scan.nextInt();
        }
    }
}
