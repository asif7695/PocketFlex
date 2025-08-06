import javax.swing.*;

public class UI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PocketFlex - CashFlow");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to PocketFlex!");
        label.setBounds(120, 20, 200, 30);

        JButton btn = new JButton("Add Expense");
        btn.setBounds(130, 100, 120, 40);

        JTextField amountField = new JTextField();
        amountField.setBounds(130, 60, 120, 30);

        frame.setLayout(null); // absolute positioning
        frame.add(label);
        frame.add(amountField);
        frame.add(btn);

        frame.setVisible(true);
    }
}
