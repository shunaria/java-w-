import javax.swing.*;
import java.awt.*;

public class ImageCard extends JPanel {
    public ImageCard (String name, String image){
        setPreferredSize(new Dimension(200,200));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        add(ImagePanel(image,200), BorderLayout.CENTER);
        add(TitlePanel(name,30),BorderLayout.SOUTH);
    }

    private JPanel ImagePanel(String image , int size){
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.WHITE);
        

        try{
            ImageIcon originalIcon = new ImageIcon(image);
            Image scaledImage = originalIcon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            imagePanel.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel placeholder = new JLabel("there isnt an image", SwingConstants.CENTER);
            placeholder.setForeground(Color.GRAY);
            imagePanel.add(placeholder);
        }

        return imagePanel;

    }
    private JPanel TitlePanel(String title, int Height ){
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(0, Height));
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel (title, SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Arial", Font.PLAIN,12));
        titlePanel.add(titleLabel);

        return titlePanel;

    }
}



