package calculadora;
import java.util.Scanner;

public class Calculadora {
/**
*
* @param num1
* @param num2
* @return
*/
public double soma(double num1, double num2) {
return num1 + num2;
}
public double subtracao(double num1, double num2) {
return num1 - num2;
}
public double multiplicacao(double num1, double num2) {
return num1 * num2;
}
public double divisao(double num1, double num2) {
return num1 / num2;
}
/**
* @param args the command line arguments
*/
@SuppressWarnings({"MalformedFormatString", "UnusedAssignment"})
public static void main(String[] args) {
    
Calculadora c1 = new Calculadora();

//Declaração de Varaveis /Atributos
int opcao = 5;
double num1, num2, operacao;

while (opcao != 0){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println ("|--------------------|");
    System.out.println ("| Calculadora Java   |");
    System.out.println ("---------------------");
    System.out.println ("| 1. Soma            |");
    System.out.println ("| 2. Subtracao       |");
    System.out.println ("| 3. Multiplicacao   |");
    System.out.println ("| 4. Divisao         |");
    System.out.println ("| 0. Sair            |");
    System.out.println ("---------------------");
    
    System.out.println ("");
    
    System.out.println("Digite sua Operação: ");
    
    opcao = input.nextInt();
        if (opcao == 0) {
        System.out.println("Bye Bye ");
        System.out.println("Volte sempre !");
        }
        else if (opcao > 4){
        System.out.println("Escolha Incorreta Tente novamente!");
        }
        else {
        System.out.println("Qual o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Qual o segundo numero: ");
        num2 = input.nextInt();
            switch (opcao) {
                case 1:
                    operacao = c1.soma(num1, num2);
                    System.out.println("O resultado da soma é: " + operacao);
                    break;
                case 2:
                   operacao = c1.subtracao(num1, num2);
                   System.out.println("O resultado da soma é: " + operacao);
                   break;
                case 3:
                    operacao = c1.multiplicacao(num1,num2);
                    System.out.println("O resultado da somaé: " + operacao);
                    break;
                case 4:
                    operacao = c1.divisao(num1, num2);
                    System.out.println("O resultado da soma é: " + operacao);
                    break;
                default:
                    break;
                }
            }
        } // fim do while - usuario optou por sair
    } // fim do metodo principal
}