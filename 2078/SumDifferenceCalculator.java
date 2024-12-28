import javax.swing.*;
import java.awt.event.*;

public class SumDifferenceCalculator {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Sum and Difference Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(50, 20, 100, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 20, 100, 30);
        frame.add(textField1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(50, 60, 100, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 60, 100, 30);
        frame.add(textField2);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 100, 300, 30);
        frame.add(resultLabel);

        // Add MouseListener to calculate sum or difference
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    // Calculate Sum
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: Sum = " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input! Enter valid numbers.");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    // Calculate Difference
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int diff = num1 - num2;
                    resultLabel.setText("Result: Difference = " + diff);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input! Enter valid numbers.");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
