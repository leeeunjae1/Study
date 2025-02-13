package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount) {
        return balance += amount;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            return balance -= amount;
        } else {
            System.out.println("잔액 부족");
            return balance;
        }
    }
}
