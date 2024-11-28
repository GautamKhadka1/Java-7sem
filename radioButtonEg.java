import java.awt.*;
import javax.swing.*;


public class radioButtonEg{
    public static void main(String[] args) {
    JFrame j = new JFrame();
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setLayout(new FlowLayout());
    // String[] country = {"Nepal", "USA", "India", "China", "Hong Kong", "Japan"};
    JRadioButton c = new JRadioButton("Male");
    JRadioButton d = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();
    bg.add(c);
    bg.add(d);
    j.add(c);
    j.add(d);
    j.setSize(300,300);
    j.setVisible(true);
    }
    
}
