import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton redButton = new JButton("RED");
        JButton blueButton = new JButton("BLUE");
        JButton greenButton = new JButton("GREEN");

        // Add action listeners to buttons
        redButton.addActionListener(e -> redButton.setBackground(Color.RED));
        blueButton.addActionListener(e -> blueButton.setBackground(Color.BLUE));
        greenButton.addActionListener(e -> greenButton.setBackground(Color.GREEN));

        frame.add(redButton);
        frame.add(blueButton);
        frame.add(greenButton);

        frame.setVisible(true);
    }
}
