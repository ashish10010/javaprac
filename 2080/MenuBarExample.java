import javax.swing.*;

public class MenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar example");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu filMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        filMenu.add(newItem);
        filMenu.add(saveItem);
        filMenu.add(exitItem);
        menuBar.add(filMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    
}
