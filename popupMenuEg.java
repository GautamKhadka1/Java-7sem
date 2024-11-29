import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class popupMenuEg {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setSize(300, 300);

        JPopupMenu p = new JPopupMenu("Edit");

        JMenuItem i1 = new JMenuItem("Copy");
        JMenuItem i2 = new JMenuItem("Paste");

        p.add(i1);
        p.add(i2);
        // j.add(p);

        j.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e)
            {
                if(e.isPopupTrigger())
                {
                    p.show(j, e.getX(), e.getY());

                }
            }
        });

        j.setVisible(true);

        

    }
}
