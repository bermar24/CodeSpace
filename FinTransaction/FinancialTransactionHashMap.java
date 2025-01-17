package FinTransaction;

import java.time.LocalDate;
import java.util.*;

public class FinancialTransactionHashMap {
    public static void main(String[] args) {

        // Use a HashMap where key is LocalDate and value is a list of transactions
        Map<LocalDate, List<String>> transactions = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFinancial Transaction Tracker");
            System.out.println("1. Add Transaction");
            System.out.println("2. Transactions Yesterday");
            System.out.println("3. Total Income and Expense");
            System.out.println("4. Exit");
            System.out.println("5. Print all");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Transaction
                    System.out.print("Enter type (Purchase/Sale): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    LocalDate date = LocalDate.now();

                    // Add transaction to the list for the given date
                    transactions.putIfAbsent(date, new ArrayList<>());
                    transactions.get(date).add(type + "," + amount);

                    System.out.println("Transaction added.");
                    break;
                case 2: // Transactions Yesterday
                    LocalDate yesterday = LocalDate.now().minusDays(1);
                    List<String> yesterdayTransactions = transactions.get(yesterday);

                    if (yesterdayTransactions != null) {
                        System.out.println("Transactions yesterday: " + yesterdayTransactions.size());
                    } else {
                        System.out.println("No transactions found for yesterday.");
                    }
                    break;
                case 3: // Total Income and Expense
                    double income = 0, expense = 0;

                    for (Map.Entry<LocalDate, List<String>> entry : transactions.entrySet()) {
                        for (String transaction : entry.getValue()) {
                            String[] parts = transaction.split(",");
                            String tType = parts[0];
                            double tAmount = Double.parseDouble(parts[1]);

                            if (tType.equalsIgnoreCase("Sale")) {
                                income += tAmount;
                            } else if (tType.equalsIgnoreCase("Purchase")) {
                                expense += tAmount;
                            }
                        }
                    }

                    System.out.println("Total Income: " + income);
                    System.out.println("Total Expense: " + expense);
                    break;
                case 4: // Exit
                    System.out.println("Exiting tracker. Goodbye!");
                    scanner.close();
                    return;
                case 5: // Print all
                    System.out.println("All transactions:");
                    for (Map.Entry<LocalDate, List<String>> entry : transactions.entrySet()) {
                        System.out.println("Date: " + entry.getKey());
                        for (String transaction : entry.getValue()) {
                            System.out.println("  " + transaction);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

