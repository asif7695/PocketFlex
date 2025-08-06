import java.util.*;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n----- PocketFlex - Expense Tracker -----");
                System.out.println("1. Add Expense");
                System.out.println("2. View Expenses");
                System.out.println("3. View Total Spent");
                System.out.println("4. Delete Expense");
                System.out.println("5. Exit");

                System.out.print("Choose: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Title: ");
                        String title = sc.nextLine();

                        System.out.print("Amount: ");
                        double amount = Double.parseDouble(sc.nextLine());

                        System.out.print("Category: ");
                        String category = sc.nextLine();

                        manager.addExpense(title, amount, category);
                        break;

                    case 2:
                        manager.viewExpenses();
                        break;

                    case 3:
                        System.out.printf("Total Spent: %.2f BDT\n", manager.getTotalSpent());
                        break;

                    case 4:
                        manager.viewExpenses();
                        if (manager.getExpenseCount() == 0) break;

                        System.out.print("Enter index to delete: ");
                        int index = Integer.parseInt(sc.nextLine()) - 1;
                        manager.deleteExpense(index);
                        break;

                    case 5:
                        System.out.println("Exiting PocketFlex. Bye!");
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }

    }
}
