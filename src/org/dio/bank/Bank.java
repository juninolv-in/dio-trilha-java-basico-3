package org.dio.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private final List<Client> clients;
    private final List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account client) {
        accounts.add(client);
    }

    public void removeAccount(Account client) {
        accounts.remove(client);
    }
}
