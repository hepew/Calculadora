import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        System.out.println("---Calculadora---");
        System.out.println("Aperte qualquer tecla para iniciar");

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.forLanguageTag("pt-BR"));
        double res = Double.parseDouble(scan.next().replace(",", "."));
        double n1, n2;
        int teste = -1;

        while (teste < 0) {
            System.out.println("\n(---ESCOLHA---)");
            System.out.println("(1) Adição");
            System.out.println("(2) Subtração");
            System.out.println("(3) Multiplicação");
            System.out.println("(4) Divisão");
            System.out.println("(0) Sair..");
            System.out.print("Resposta: ");
            int pepe = scan.nextInt();

            switch (pepe) {
                case 1:
                    System.out.print("\n---(ADIÇÃO)---\n");
                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextDouble();
                    res = n1 + n2;
                    System.out.print("O resultado de " + n1 + " + " + n2 + " = " + "(" + res + ")\n\n");
                    break;
                case 2:
                    System.out.print("\n---(SUBTRAÇÃO)---\n");
                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextDouble();
                    res = n1 - n2;
                    System.out.print("O resultado de " + n1 + " - " + n2 + " = " + "(" + res + ")\n\n");
                    break;
                case 3:
                    System.out.print("\n---(MULTIPLICAÇÃO)---\n");
                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextDouble();
                    res = n1 * n2;
                    System.out.print("O resultado de " + n1 + " * " + n2 + " = " + "(" + res + ")\n\n");
                    break;
                case 4:
                    System.out.print("\n---(DIVISÃO)---\n");
                    System.out.print("Escolha o primeiro número: ");
                    n1 = scan.nextDouble();
                    System.out.print("Escolha o segundo número: ");
                    n2 = scan.nextDouble();

                    if (n2 == 0) {
                        System.out.println("[ERRO] Esse número NÃO pode ser divisivel... :(\n");
                    } else {
                        res = n1 / n2;
                        System.out.print("O resultado de " + n1 + " / " + n2 + " = " + "(" + res + ")\n\n");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default: {
                    System.out.println("\n[ERRO]... Tente novamente..");
                }
            }
        }
        scan.close();
    }
}
