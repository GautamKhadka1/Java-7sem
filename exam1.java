import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class exam1
{
    public static void main(String[] args) {
        JFrame f =new JFrame();
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JButton("East"), BorderLayout.EAST);
        f.add(new JButton("West"), BorderLayout.WEST);

        f.add(new JButton("North"), BorderLayout.NORTH);

        f.add(new JButton("South"), BorderLayout.SOUTH);

        f.add(new JButton("Center"), BorderLayout.CENTER);
        f.setVisible(true);

    }
}