import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    try{
        System.out.println("Por favor, didite a Agência: ");
        String agencia = s.next();
        System.out.println("Por favor, didite o número da conta: ");
        String cont = s.next();
        System.out.println("Por favor, digite seu nome: ");
        String nome = s.next();
        Integer saldo = 0;
        System.out.printf("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + cont + " e seu saldo " + saldo + " ja está disponível para saque");
    } finally{
        s.close();
    }

    }};
    //Exibir as mensagens para nosso usuário

    //Obter pela Scanner os valores digitados no terminal

    //Exibir a mensagem conta criada

