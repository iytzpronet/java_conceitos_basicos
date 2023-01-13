import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double Saldo = 25;
        double Valor_Solicitado = 18;


        if (Saldo > Valor_Solicitado) {
            System.out.println("Seu Saldo é: " + "$" + Saldo + "\n valor Solicitado: " + "$" + Valor_Solicitado + "\n saque realizado!");
            Saldo = Saldo - Valor_Solicitado;
            System.out.println("Saldo = " + "$" + Saldo);



        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
