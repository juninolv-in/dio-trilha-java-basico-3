package org.dio.bank;

public interface IAccount {
    void withdraw(double amount);
    void deposit(double amount);
    void transfer(IAccount destination, double amount);
    String extract();
}
