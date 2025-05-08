import javax.swing.*;
import java.awt.*;

public class mainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HSR chara");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080,630);

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        sidebar sidebar = new sidebar();
        mainPanel.add(sidebar , BorderLayout.WEST);

        content content = new content();
        mainPanel.add(content, BorderLayout.CENTER);

        topbar topBar = new topbar();
        mainPanel.add(topBar , BorderLayout.PAGE_START);

        frame.add(mainPanel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
 
    }
    
}
