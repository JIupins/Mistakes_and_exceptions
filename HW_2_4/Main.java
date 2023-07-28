import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner iScan = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("\nВведите символ операции:\n"+
            "1 - Перечень всех счетов.\n"+
            "2 - Открыть счет.\n"+
            "3 - Снядь средства со счета.\n"+
            "4 - Положить средства на счет.\n"+
            "5 - Закрыть счет.\n"+
            "6 - Выйти из программы.");
            System.out.print("Введите значение: ");
            int num = iScan.nextInt();

            switch (num) {
                case 1:
                bank.getListOfAccounts();
                    break;
                case 2:
                    bank.CreateAccount();
                    break;
                case 3:
                    bank.takeMoney();
                    break;
                case 4:
                    bank.putMoney();
                    break;
                case 5:
                    bank.removeAccount();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                System.out.println("Символ введен неправильно повторите ввод");
                    break;
            }
        }
    }
}
