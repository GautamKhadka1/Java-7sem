import java.awt.*;
import javax.swing.*;

public class menuBarEg {
    public static void main(String[] args) {
        
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300, 300);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Home");
        JMenu m2 = new JMenu("Packages");
        JMenu i1 = new JMenu("Pokhara");
        JMenuItem i2 = new JMenuItem("Chitwan");
        JRadioButtonMenuItem i3 = new JRadioButtonMenuItem("Trekking");
        JRadioButtonMenuItem i4 = new JRadioButtonMenuItem("Hiking");
        ButtonGroup bg = new ButtonGroup();
        bg.add(i3);
        bg.add(i4);
        i1.add(i3);
        i1.add(i4);
        m2.add(i1);
        m2.add(i2);
        mb.add(m1);
        mb.add(m2);
        j.setJMenuBar(mb);
        j.setVisible(true);
    }
}
