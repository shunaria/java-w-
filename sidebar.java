import javax.swing.*;
import java.awt.*;

public class sidebar extends JPanel {

    public sidebar() {
        setBackground(new Color(50, 50, 50));
        setPreferredSize(new Dimension(200, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton Home = new JButton("Home");
        JButton Characters = new JButton("Characters");
        JButton TierList = new JButton("Tier List");
        JButton MOC = new JButton("MOC");
        JButton LC = new JButton("LC");
        JButton Relic = new JButton("Relic");
        JButton Guides = new JButton("Guides");
        JButton Tools = new JButton("Tools");

        styleButton(Home);
        styleButton(Characters);
        styleButton(TierList);
        styleButton(MOC);
        styleButton(LC);
        styleButton(Relic);
        styleButton(Guides);
        styleButton(Tools);


        add(Box.createVerticalStrut(10));
        add(Home);
        add(Box.createVerticalStrut(10));
        add(Characters);
        add(Box.createVerticalStrut(10));
        add(TierList);
        add(Box.createVerticalStrut(10));
        add(MOC);
        add(Box.createVerticalStrut(10));
        add(LC);
        add(Box.createVerticalStrut(10));
        add(Relic);
        add(Box.createVerticalStrut(10));
        add(Guides);
        add(Box.createVerticalStrut(10));
        add(Tools);
    }


    private void styleButton(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 70, 70));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(180, 40));
    }
}
