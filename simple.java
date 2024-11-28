import java.awt.*;
import javax.swing.*;

public class simple {
    public simple()
    {
        JFrame frame= new JFrame("Grid Layout.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));
        frame.add(
            new JButton("First")
        );
        frame.add(
            new JButton("Second")
        );
        frame.add(
            new JButton("Third")
        );
        frame.add(
            new JButton("Fourth")
        );
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        simple s =new simple();
    }
}