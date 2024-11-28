import java.awt.*;
import javax.swing.*;


public class comboboxeg {
    public static void main(String[] args) {
    JFrame j = new JFrame();
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setLayout(new FlowLayout());
    String[] country = {"Nepal", "USA", "India", "China", "Hong Kong", "Japan"};
    JComboBox c = new JComboBox<>(country);
    j.add(c);
    j.setSize(300,300);
    j.setVisible(true);
    }
    
}
