import java.awt.*;
import javax.swing.*;

public class sliderEg {
   public static void main(String[] args) {
    JFrame j = new JFrame();
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JSlider s = new JSlider(JSlider.HORIZONTAL, 0,100,50);
    s.setMajorTickSpacing(20);
    s.setMinorTickSpacing(5);
    s.setPaintTicks(true);
    s.setPaintLabels(true);

    j.add(s);
    j.setSize(300, 300);
    j.setVisible(true);
   } 
}
