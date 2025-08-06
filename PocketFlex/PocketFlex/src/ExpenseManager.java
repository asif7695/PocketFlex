import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(String title,double amount,String category){
        Expense expense = new Expense(title, amount, category);
        expenses.add(expense);
        System.out.println("Expense added!!!");
    }

    public void viewExpenses(){
        if (expenses.isEmpty()){
            System.out.println("No expenses to show.");
            return;
        }

        System.out.println("All Expenses:");
        for (int i = 0; i < expenses.size(); i++){
            System.out.print((i + 1) + ". ");
            expenses.get(i).display();
        }
    }

    public double getTotalSpent(){
        double total = 0;
        for (Expense exp : expenses){
            total += exp.getAmount();
        }
        return total;
    }

    public void deleteExpense(int index){
        if(index < 0 || index >= expenses.size()){
            System.out.println("Invalid index.");
            return;
        }
        expenses.remove(index);
        System.out.println("Expense deleted.");
    }

    public int getExpenseCount() {
        return expenses.size();
    }

}
