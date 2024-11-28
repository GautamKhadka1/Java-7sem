import java.awt.*;
import javax.swing.*;


public class scrollPaneEg {
    public static void main(String[] args) {
    JFrame j = new JFrame();
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setLayout(new FlowLayout());
    //String[] country = {"Nepal", "USA", "India", "China", "Hong Kong", "Japan"};
    JLabel label = new JLabel("<html>This is a JLabel inside a JScrollPane.<br>It supports scrolling for long content!</html>");
    JScrollPane jsp = new JScrollPane(label, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    j.add(jsp);
    j.setSize(300,200);
    j.setVisible(true);
    }
    
}
