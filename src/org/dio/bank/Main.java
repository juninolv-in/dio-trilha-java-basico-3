package org.dio.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bradesco");

        Client client1 = new Client("João");
        Client client2 = new Client("Maria");

        bank.addClient(client1);
        bank.addClient(client2);

        Account checkingAccount = new CheckingAccount(client1);
        checkingAccount.setAgency("12345");
        checkingAccount.setNumber("123456789");
        checkingAccount.setBalance(850.99);

        bank.addAccount(checkingAccount);

        System.out.println(checkingAccount.extract());

        Account savingsAccount = new SavingsAccount(client2);
        savingsAccount.setAgency("12345");
        savingsAccount.setNumber("987654321");
        savingsAccount.setBalance(3965.25);

        bank.addAccount(savingsAccount);

        System.out.println(savingsAccount.extract());

        checkingAccount.transfer(savingsAccount, 50.99);

        System.out.println(checkingAccount.extract());
        System.out.println(savingsAccount.extract());
    }
}