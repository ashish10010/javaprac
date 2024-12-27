import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world Program");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Hello World!");
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
    
}
