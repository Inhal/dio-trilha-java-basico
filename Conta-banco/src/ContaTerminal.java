import java.util.Locale;
import java.util.Scanner;



        public class ContaTerminal {
        public static void main(String[] args) {
            

            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite o número da Agência !");
            int NumeroAgencia = scanner.nextInt();

            System.out.println("Por favor, digite qual a sua agencia !");
            String NomeAgencia = scanner.next();

            System.out.println("Por favor, digite seu nome e sobrenome !");
            String NomeCliente = scanner.next();

            System.out.println("Por favor, digite o seu saldo !");
            double SaldoCliente = scanner.nextDouble();
         
            System.out.println("Ola "+ NomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + NomeAgencia + " conta numero: "+ NumeroAgencia + " e seu saldo de: "+ 
            SaldoCliente + " já esta disponível para o saque"  );

        }
    }