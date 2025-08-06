public class Expense {
    private String title;
    private double amount;
    private String category;

    public Expense(String title,double amount,String category) {
        this.title=title;
        this.amount=amount;
        this.category=category;
    }
    public String getTitle() {
        return title;
    }
    public double getAmount() {
        return amount;
    }
    public String getCategory() {
        return category;
    }
    public void display() {
        System.out.println("Title: "+title+", Amount: "+amount+" BDT, Category: "+category);
    }







}
