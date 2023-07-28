
public class BankAccount {
    int numberOfAccount;
    double userBalance;

    public BankAccount(double userBalance, int numberOfAccount) {
        this.userBalance = userBalance;
        this.numberOfAccount = numberOfAccount;
    }

    public void setBalance(double value) {
        this.userBalance += value;
    }

    public String lowBalance(double value) {
        if (this.userBalance > 0) {
            if (value <= this.userBalance) {
                this.userBalance -= value;
                String message = String.format("\nВы сняли: %f. Tекущий баланс: %f.", value, this.userBalance);
                return message;
            } else {
                String message = String.format("\nВы не можете сняли: %f! Так как текущий баланс: %f.", value,
                        this.userBalance);
                return message;
            }
        } else {
            String message = String.format("\nНа балансе нет средств! Текущий баланс: %f.", value, this.userBalance);
            return message;
        }
    }

    public double getBalance() {
        return this.userBalance;
    }

    public int getNumberOfAccount() {
        return this.numberOfAccount;
    }
}