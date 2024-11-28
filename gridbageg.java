import java.awt.*;
import javax.swing.*;

public class gridbageg {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Add "First" button at (0, 0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1; // Reset gridwidth for this component
        panel.add(new JButton("First"), gbc);

        // Add "Second" button at (0, 1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Second"), gbc);

        // Add "Third" button at (1, 1) with gridwidth = 3
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3; // Span 3 columns
        panel.add(new JButton("Third"), gbc);

        // Add "Fourth" button at (1, 2) with gridwidth = 3
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JButton("Fourth"), gbc);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(1500, 500);
        frame.setVisible(true);
    }
}
