import java.util.Scanner;
public class EstruturasControle {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // if-else + operadores relacionais
 System.out.print("Digite sua idade: ");
 int idade = sc.nextInt();
 if (idade >= 18) {
 System.out.println("Você é maior de idade.");
 } else {
 System.out.println("Você é menor de idade.");
 }
 // switch
 System.out.print("Digite o número do dia da semana (1 a 7): ");
 int dia = sc.nextInt();
 switch (dia) {
 case 1: System.out.println("Domingo"); break;
 case 2: System.out.println("Segunda-feira"); break;
 case 3: System.out.println("Terça-feira"); break;
 case 4: System.out.println("Quarta-feira"); break;
 case 5: System.out.println("Quinta-feira"); break;
 case 6: System.out.println("Sexta-feira"); break;
 case 7: System.out.println("Sábado"); break;
 default: System.out.println("Dia inválido");
 }
 // operadores aritméticos e for
 System.out.println("\nTabuada do 5:");
 for (int i = 1; i <= 10; i++) {
 System.out.println("5 x " + i + " = " + (5 * i));
 }
 // while
 int contador = 0;
 System.out.println("\nContando até 5 com while:");
 while (contador < 5) {
 System.out.println("Contador: " + contador);
 contador++;
 }
 // do-while
 String continuar;
 do {
 System.out.print("\nDigite uma nota (0 a 10): ");
 int nota = sc.nextInt();
 if (nota >= 6) {
 System.out.println("Aluno aprovado!");
 } else {
 System.out.println("Aluno reprovado.");
 }
 System.out.print("Deseja digitar outra nota? (s/n): ");
 continuar = sc.next();
 } while (continuar.equalsIgnoreCase("s"));
 sc.close();
 System.out.println("Programa encerrado.");
 }
}