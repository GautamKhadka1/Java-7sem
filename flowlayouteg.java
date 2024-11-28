import java.awt.*;
import javax.swing.*;

public class flowlayouteg{
    public static void main(String[] args) {
        JFrame j= new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(
            new FlowLayout()
        );
        j.add(new JButton("First"));
        j.add(new JButton("Second"));
        j.add(new JButton("Third"));
        j.add(new JButton("Fourth"));
        j.setSize(500,500);
        j.setVisible(true);
    }
}