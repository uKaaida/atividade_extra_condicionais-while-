import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean NeverEnd = true;
        System.out.println("Digite um número maior que 0: ");
        numero = scan.nextInt();
        while(NeverEnd){
            while(numero < 0){
                System.out.println("Número inválido!!!!!\nDigite um número maior que 0: ");
                numero = scan.nextInt();
            }
            while(numero%2==0){
                System.out.println("É PAR!!");
                numero = scan.nextInt();
            }
            while(numero%3==0){
                System.out.println("É IMPAR!!");
                numero = scan.nextInt();
            }
        }
    }
}



//NÃO FINALIZADO!!!