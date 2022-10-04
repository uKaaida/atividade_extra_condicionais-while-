import java.util.Scanner;
import java.io.IOException;

public class Question01 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int idade, salario;
        String sexoString, estadocivilString;
        char sexo,estadocivil;
     
        System.out.println("Digite sua idade de 0 a 150: ");
        idade = scan.nextInt();
        while(idade < 0 || idade > 150){
            System.out.println("Idade Inválida!!!\ndigite novamente uma idade entra 0 a 150: ");
            idade = scan.nextInt();
        }
        System.out.println("Digite seu salário mensal: ");
        salario = scan.nextInt();
        while(salario < 0){
            System.out.println("Salário Inválido!!!\ndigite novamente seu salário mensal: ");
            salario = scan.nextInt();
        }
        System.out.println("Digite seu sexo, letra M para sexo masculino e letra F para sexo feminino: ");
        sexoString = scan.next();
        sexo = sexoString.charAt(0);
        while(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f'){
            System.out.println("Sexo Inválido!!!\ndigite seu sexo seguindo estas normas:\nM / Masculino\nF / Feminino");
            sexoString = scan.next();
            sexo = sexoString.charAt(0);
        }
        System.out.println("Digite seu Estado Civil, letra S para Solteiro, C para Casado, V para Viuvo e D para Divorciado: ");
        estadocivilString = scan.next();
        estadocivil = estadocivilString.charAt(0);
        while(estadocivil != 's' && estadocivil != 'S' && estadocivil != 'c' && estadocivil != 'C' && estadocivil != 'v' && estadocivil != 'V' && estadocivil != 'd' && estadocivil != 'D'){
            System.out.println("Estado Civil Inválido!!!\ndigite seu Estado Civil seguindo estas normas:\nS / Solteiro\nC / Casado\nV / Viuvo\nD / Divorciado");
            estadocivilString = scan.next();
            estadocivil = estadocivilString.charAt(0);
        }
        System.out.println("\nO estado atual do individuo é:\nIdade: "+idade+" anos\nSexo: "+sexo+"\nEstado Civil: "+estadocivil+"\nRenda Mensal: R$"+salario);

    }
}