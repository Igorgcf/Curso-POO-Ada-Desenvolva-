package Class04;

public class Main {

    public static void main(String[] args) {

        User user = new User(1, "manager", "John Doe");
        User user01 = new User(1, "Client", "Victor Doe");
        BankAccount account = new BankAccount(user, "123.456.789-0");
        BankAccount account01 = new BankAccount(user01, "123.456.789-A");

        System.out.println("\n------------------------------");
        System.out.println("Conta Bancaria do gerente:");
        System.out.println("Titular: " + account.getHolder());
        System.out.println("Numero da Conta: " + account.getAccountNumber());
        System.out.println("Inserindo saldo na conta do gerente:");
        account.setBalance(1000.00);
        System.out.println("Saldo: " + account.getBalance());

        System.out.println("\n------------------------------'");
        System.out.println("Conta Bancaria do Cliente:");
        System.out.println("Titular: " + account01.getHolder());
        System.out.println("Numero da Conta: " + account01.getAccountNumber());
        System.out.println("Tentando inserir saldo na conta do cliente:");
        account01.setBalance(500.00);
        System.out.println("Saldo: " + account01.getBalance());
    }
}
