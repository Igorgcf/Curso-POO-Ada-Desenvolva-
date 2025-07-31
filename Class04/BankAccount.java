package Class04;

public class BankAccount {

    private User user;
    private String holder;
    private String AccountNumber;
    private double Balance;

    public BankAccount(User user, String accountNumber) {
        this.user = user;
        this.holder = user.getName();
        AccountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        if (user.getProfile().equals("manager")) {
            this.Balance = balance;
        }else{
            System.out.println("Apenas o gerente pode inserir saldo na conta.");
        }
    }
}
