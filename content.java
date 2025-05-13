import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Content extends JPanel {
    private JPanel cardGrid;
    private Map<String, ImageCard[]> cardSets;
    private String currentSet;

    public Content() {
        setLayout(new BorderLayout());
        setBackground(new Color(230, 230, 230));
        
        // Initialize card sets
        cardSets = new HashMap<>();
        initializeCardSets();
        
        // Create the card grid
        cardGrid = new JPanel(new GridLayout(0, 4, 10, 10));
        cardGrid.setBackground(new Color(230, 230, 230));
        cardGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Set default card set
        showCardSet("Characters");
        
        JScrollPane scrollPane = new JScrollPane(cardGrid);
        scrollPane.setBorder(null);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    private void initializeCardSets() {

        cardSets.put("Home", new ImageCard[] {
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"),
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("acheron", "ache.jpg"),
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("rappa", "rappa.jpg"),
            new ImageCard("castorice", "casto.jpg"),

        });
        // Characters set
        cardSets.put("Characters", new ImageCard[] {
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("acheron", "ache.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"),
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("rappa", "rappa.jpg")
        });
        
        // Tier List set (example with different cards)
       cardSets.put("Tier List", new ImageCard[] {
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("rappa", "rappa.jpg"),
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("acheron", "ache.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg")
        });
        
        // MOC set (example)
        cardSets.put("MOC", new ImageCard[] {
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("rappa", "rappa.jpg"),
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("acheron", "ache.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"),
        });

        cardSets.put("LC", new ImageCard[] {
            new ImageCard("rappa", "rappa.jpg"),
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("acheron", "ache.jpg"),
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"),
        });

        cardSets.put("Relic", new ImageCard[] {
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),         
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("rappa", "rappa.jpg"), 
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"), 
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("acheron", "ache.jpg"),
  
    
        });

        cardSets.put("Guides", new ImageCard[] {
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("rappa", "rappa.jpg"), 
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),         
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"), 
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("acheron", "ache.jpg"),
  
    
        });

        cardSets.put("Tools", new ImageCard[] {
            new ImageCard("fuxuan", "loli.jpg"),
            new ImageCard("yelan", "yelan.jpg"), 
            new ImageCard("ruan mei", "rm.jpg"),
            new ImageCard("raiden mei", "raiden mei.jpg"),
            new ImageCard("seele", "seele.jpg"),
            new ImageCard("lingsha", "lingsha.jpg"),         
            new ImageCard("Aglaea", "latest.png"),
            new ImageCard("anaxa", "anaxa.png"),
            new ImageCard("castorice", "casto.jpg"),
            new ImageCard("rappa", "rappa.jpg"), 
            new ImageCard("phainon", "phai.jpg"),
            new ImageCard("kiana", "kiana.jpg"),
            new ImageCard("arlechino", "arlechino.jpg"),
            new ImageCard("feixiao", "fx.jpg"),
            new ImageCard("acheron", "ache.jpg"),
  
    
        });
        
        // Add more sets as needed for other buttons
    }
    
    public void showCardSet(String setName) {
        if (cardSets.containsKey(setName) && !setName.equals(currentSet)) {
            currentSet = setName;
            cardGrid.removeAll();
            
            for (ImageCard card : cardSets.get(setName)) {
                cardGrid.add(card);
            }
            
            cardGrid.revalidate();
            cardGrid.repaint();
        }
    }
}