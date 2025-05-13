// SidebarButton.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SidebarButton extends JButton {
    public SidebarButton(String text, ActionListener listener) {
        super(text);
        setPreferredSize(new Dimension(180, 40));
        setMaximumSize(new Dimension(180, 40));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBackground(new Color(70, 70, 70));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        addActionListener(listener);
    }
    
    public String getButtonName() {
        return getText();
    }
}