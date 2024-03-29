package org.dio.bank;

public abstract class Account implements IAccount {
    private String agency;
    private String number;
    private double balance;
    private Client client;

    protected Account(Client client) {
        this.client = client;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transfer(IAccount destination, double amount) {
        withdraw(amount);
        destination.deposit(amount);
    }

    @Override
    public String extract() {
        return String.format("Client: %s | Account: %s | Agency: %s | Balance: %s",
            getClient().getName(), getNumber(), getAgency(), getBalance()
        );
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
