import java.awt.*;
import javax.swing.*;

public class popupMenuEg {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300, 300);

        JPopupMenu p = new JPopupMenu("Edit");

        JMenuItem i1 = new JMenuItem("Copy");
        JMenuItem i2 = new JMenuItem("Paste");

        p.add(i1);
        p.add(i2);
        j.add(p);
        j.setVisible(true);

    }
}
