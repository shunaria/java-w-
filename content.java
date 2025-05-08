import javax.swing.*;
import java.awt.*;

public class content extends JPanel { // Following Java naming conventions

    public content() {
        setLayout(new BorderLayout());
        setBackground(new Color(230, 230, 230));

        JPanel cardGrid = new JPanel(new GridLayout(0, 4, 10, 10)); // 4 columns with gaps
        cardGrid.setBackground(new Color(230, 230, 230));
        cardGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add each card once
        cardGrid.add(new ImageCard("Aglaea", "latest.png"));
        cardGrid.add(new ImageCard("anaxa", "anaxa.png"));
        cardGrid.add(new ImageCard("castorice", "casto.jpg"));
        cardGrid.add(new ImageCard("acheron", "ache.jpg"));
        cardGrid.add(new ImageCard("fuxuan", "loli.jpg"));
        cardGrid.add(new ImageCard("yelan", "yelan.jpg"));
        cardGrid.add(new ImageCard("ruan mei", "rm.jpg"));
        cardGrid.add(new ImageCard("raiden mei", "raiden mei.jpg"));
        cardGrid.add(new ImageCard("phainon", "phai.jpg"));
        cardGrid.add(new ImageCard("kiana", "kiana.jpg"));
        cardGrid.add(new ImageCard("seele", "seele.jpg"));
        cardGrid.add(new ImageCard("lingsha", "lingsha.jpg"));
        cardGrid.add(new ImageCard("arlechino", "arlechino.jpg"));
        cardGrid.add(new ImageCard("feixiao", "fx.jpg"));
        cardGrid.add(new ImageCard("rappa", "rappa.jpg"));

        JScrollPane scrollPane = new JScrollPane(cardGrid);
        scrollPane.setBorder(null);

        add(scrollPane, BorderLayout.CENTER);
    }
}