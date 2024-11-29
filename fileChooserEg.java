import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fileChooserEg {
    public static void main(String[] args) {
        JFrame f =new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(f);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(f, "Selected File: " + path);
        }
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
