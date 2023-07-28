
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    static Map<Integer, BankAccount> listOfAccounts = new HashMap<>();
    Scanner iScan = new Scanner(System.in);

    public void CreateAccount() {
        Scanner iScan = new Scanner(System.in);
        System.out.print("\nВведите номер счета: ");
        int numberOfAccount = iScan.nextInt();
        System.out.print("Введите сумму которую вы хотите положить на счет: ");
        double monney = iScan.nextDouble();
        BankAccount account = new BankAccount(monney, numberOfAccount);
        listOfAccounts.put(numberOfAccount, account);
    }

    public void getListOfAccounts() {
        System.out.println("\nПеречень доступных счетов:");
        if (listOfAccounts.isEmpty()) {
            System.out.println("Открытых счетов нет!");
        } else {
            for (Map.Entry<Integer, BankAccount> i : listOfAccounts.entrySet()) {
                System.out.printf("Номер счета: %d. Средства на счете: %f.\n", i.getKey(), i.getValue().userBalance);
            }
        }
    }

    public void putMoney() {
        System.out.print("\nВведите номер счета: ");
        int numberOfAccount = iScan.nextInt();

        boolean flag = true;
        while (flag) {
            if (listOfAccounts.keySet().contains(numberOfAccount)) {
                System.out.printf("На текущий момент на данном счете: %f\n",
                        listOfAccounts.get(numberOfAccount).getBalance());
                System.out.print("Введите сумму которую вы хотите положить на счет: ");
                double quantityOfMoney = iScan.nextDouble();
                listOfAccounts.get(numberOfAccount).setBalance(quantityOfMoney);
                flag = false;
            } else {
                flag = true;
                System.out.println("Счета с таким номером не существует! Уточните номер счета: ");
                numberOfAccount = iScan.nextInt();
            }
        }
    }

    public void takeMoney() {
        System.out.print("\nВведите номер счета: ");
        int numberOfAccount = iScan.nextInt();

        boolean flag = true;
        while (flag) {
            if (listOfAccounts.keySet().contains(numberOfAccount)) {
                System.out.printf("На текущий момент на данном счете: %f\n",
                        listOfAccounts.get(numberOfAccount).getBalance());
                System.out.print("Введите сумму которую вы хотите снять со счета: ");
                double quantityOfMoney = iScan.nextDouble();
                System.out.println(listOfAccounts.get(numberOfAccount).lowBalance(quantityOfMoney));
                flag = false;
            } else {
                flag = true;
                System.out.println("Счета с таким номером не существует! Уточните номер счета: ");
                numberOfAccount = iScan.nextInt();
            }
        }
    }

    public void removeAccount() {
        if (listOfAccounts.isEmpty()) {
            System.out.println("\nОткрытых счетов нет!");
        } else {
            System.out.print("\nВведите номер счета: ");
            int numberOfAccount = iScan.nextInt();

            boolean flag1 = true;
            while (flag1) {
                if (listOfAccounts.keySet().contains(numberOfAccount)) {
                    listOfAccounts.remove(numberOfAccount);
                    System.out.printf("Счет с номером %d закрыт!\n", numberOfAccount);
                    flag1 = false;
                } else {
                    System.out.print("Счета с таким номером не существует! Уточните номер счета: ");
                    numberOfAccount = iScan.nextInt();
                    flag1 = true;
                }
            }
        }
    }
}