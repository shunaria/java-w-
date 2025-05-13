import javax.swing.*;
import java.awt.*;

public class mainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HSR chara");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 630);

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Create content first
        Content content = new Content();
        
        // Create sidebar with listener that updates content
        Sidebar sidebar = new Sidebar(new Sidebar.SidebarButtonListener() {
            @Override
            public void buttonClicked(String buttonName) {
                content.showCardSet(buttonName);
            }
        });
        
        mainPanel.add(sidebar, BorderLayout.WEST);
        mainPanel.add(content, BorderLayout.CENTER);

        Topbar topBar = new Topbar();
        mainPanel.add(topBar, BorderLayout.PAGE_START);

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}