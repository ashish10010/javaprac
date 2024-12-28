import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing table Example");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] column = {"ID", "TITLE", "GENRE"};
        String[] [] data = {
             {"1", "Inception", "Sci-Fi"},
             {"2", "Titanic", "Romance"},
             {"3", "Jatra", "Comedy"},
        };

        Jtable table = new Jtable(new DefaultTableModel(data, column));
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
    
}
