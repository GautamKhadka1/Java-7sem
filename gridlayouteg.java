import java.awt.*;
import javax.swing.*;

public class gridlayouteg{
    public static void main(String[] args) {
        JFrame j= new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // j.setLayout(
        //     new GridLayout(2,2)
        // );
        JPanel panel = new JPanel(new GridLayout(2,2));
        panel.add(new JButton("First"));
        panel.add(new JButton("Second"));
        panel.add(new JButton("Third"));
        panel.add(new JButton("Fourth"));
        j.add(panel);
        j.setSize(500,500);
        j.setVisible(true);
    }
}