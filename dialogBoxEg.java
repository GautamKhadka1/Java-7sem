import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dialogBoxEg {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String gender = JOptionPane.showInputDialog(j, "Enter Your Gender:");
        JOptionPane.showConfirmDialog(j, "Are You Sure?");
        JOptionPane.showMessageDialog(j, "You are Gay.");
        j.setSize(300, 300);
        j.setVisible(true);
    }
}
