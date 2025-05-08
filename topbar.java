import javax.swing.*;
import java.awt.*;

public class topbar extends JPanel {
    public topbar() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(200,45));
        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBackground(Color.BLACK);
        leftPanel.setOpaque(false);
        
        JLabel titleLabel = new JLabel("HSR chara");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 12));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10 , -5));
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.setOpaque(false);

        JButton discord = new JButton ("Join Discord");
        discord.setBackground(new Color (65,105,225));
        JButton KOfi = new JButton("buy us KO-FI"); 
        KOfi.setBackground(new Color(50,205,50));

               // Style buttons (your existing code)
               styleButton(discord);
               styleButton(KOfi);
               
               // Add buttons to button panel (instead of directly to TopBar)
               buttonPanel.add(discord);
               buttonPanel.add(KOfi);
               
               // Add both panels to the main TopBar
               add(leftPanel, BorderLayout.WEST);
               add(buttonPanel, BorderLayout.EAST);
               
               // Adjust padding if needed
               setBorder(BorderFactory.createEmptyBorder(7, 10, 5, 0));
           }
           
           private void styleButton(JButton button) {
               button.setForeground(Color.WHITE);
               button.setFocusPainted(false);
               button.setBorder(BorderFactory.createEmptyBorder(7, 5, 5, 5));
               button.setPreferredSize(new Dimension(100, 35));
           }
       }
    

