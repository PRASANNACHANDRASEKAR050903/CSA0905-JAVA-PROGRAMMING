class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount);
            } else {
                System.out.println("Insufficient funds. Balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account myAccount = new Account(1000.0); 

        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(500.0); // Deposit $500
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.withdraw(200.0); // Withdraw $200
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.withdraw(1500.0); // Attempt to withdraw more than the balance
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
