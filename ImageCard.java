import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageCard extends JPanel {
    private String name;
    private String imagePath;
    
    public ImageCard(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
        
        setPreferredSize(new Dimension(200, 200));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        add(ImagePanel(imagePath, 200), BorderLayout.CENTER);
        add(TitlePanel(name, 30), BorderLayout.SOUTH);
        
        addMouseListener(new CardClickListener());
    }

    private JPanel ImagePanel(String image, int size) {
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.WHITE);
        imagePanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        
        try {
            ImageIcon originalIcon = new ImageIcon(image);
            Image scaledImage = originalIcon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            imagePanel.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel placeholder = new JLabel("No image available", SwingConstants.CENTER);
            placeholder.setForeground(Color.GRAY);
            imagePanel.add(placeholder);
        }

        return imagePanel;
    }

    private JPanel TitlePanel(String title, int height) {
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(0, height));
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 12));
        titlePanel.add(titleLabel);

        return titlePanel;
    }
    
    private class CardClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            showCardPopup();
        }
    }
    
    private void showCardPopup() {
        // Create the popup window (JDialog)
        JDialog popup = new JDialog();
        popup.setTitle("Character Details");
        popup.setLayout(new BorderLayout());
        popup.setSize(400, 500);
        popup.setLocationRelativeTo(null);
        popup.setModal(true);
        
        // Main content panel with padding
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Image display panel
        JPanel imageContainer = new JPanel(new BorderLayout());
        imageContainer.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        try {
            ImageIcon originalIcon = new ImageIcon(imagePath);
            Image scaledImage = originalIcon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            imageLabel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
            imageContainer.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel placeholder = new JLabel("No image available", SwingConstants.CENTER);
            placeholder.setForeground(Color.GRAY);
            imageContainer.add(placeholder);
        }
        
        // Character name label (below the image)
        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 15, 0));
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Description panel
       JTextArea descriptionArea = new JTextArea(getCharacterDescription(name));
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setFont(new Font("Arial", Font.PLAIN, 13)); // Increased font size
        descriptionArea.setMargin(new Insets(10, 10, 10, 10)); // Add padding inside text area
        
        JScrollPane descriptionScroll = new JScrollPane(descriptionArea);
        descriptionScroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        descriptionScroll.setPreferredSize(new Dimension(450, 300)); // Larger scroll area
        
        // Add components to content panel
        contentPanel.add(imageContainer);
        contentPanel.add(nameLabel);
        contentPanel.add(descriptionScroll);
        
        // Close button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> popup.dispose());
        buttonPanel.add(closeButton);
        
        // Add all components to dialog
        popup.add(contentPanel, BorderLayout.CENTER);
        popup.add(buttonPanel, BorderLayout.SOUTH);
        
        popup.setVisible(true);
    }
    
    private String getCharacterDescription(String characterName) {
        // Example descriptions - replace with your actual content
        switch (characterName.toLowerCase()) {
            case "aglaea":
                return "this is a remeberance chara from HSR";
            case "anaxa":
                return "anaxa is a erudition chara from HSR";
            case "castorice":
                return "she has a pet dragon that is her sister";
            case "acheron":
                return "her real name is Raiden Bosenmori Mei";
            case "fuxuan":
                return "she is a preservation loli";
            case "yelan":
                return "she isn't a HSR chara";
            case "raiden mei":
                return "she is a original mei";
            case "ruan mei":
                return "she is a break team stable";
            case "phainon":
                return "he isn't a playable chara yet";
            case "kiana":
                return "she is the poster child of honkai impact 3rd";
            case "seele":
                return "she's basically dead in the meta but she can still 0 cycle";
            case "lingsha":
                return "she's bascially a DPS";
            case "arlechino":
                return "well she is a genshin character ";
            case "feixiao":
                return "you are a half furry lover";
            case "rappa":
                return "she is a rapper and a ninja";
            default:
                return "No detailed description available for " + characterName + ".\n\n"
                     + "This character's backstory and abilities are currently being documented. "
                     + "Please check back later for updates!";
        }
    }
}