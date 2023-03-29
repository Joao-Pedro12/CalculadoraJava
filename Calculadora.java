import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double resultado = 0;
    boolean primeiraIteracao = true;

    while (true) {
      System.out.print("Digite um número: ");
      double numero = scanner.nextDouble();

      if (primeiraIteracao) {
        resultado = numero;
        primeiraIteracao = false;
      } else {
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        switch (operador) {
          case "+":
            resultado += numero;
            break;
          case "-":
            resultado -= numero;
            break;
          case "*":
            resultado *= numero;
            break;
          case "/":
            if (numero == 0) {
              System.out.println("Não é possível dividir por zero!");
            } else {
              resultado /= numero;
            }
            break;
          default:
            System.out.println("Operador inválido!");
            break;
        }
      }

      System.out.println("Resultado: " + resultado);
    }
  }
}
