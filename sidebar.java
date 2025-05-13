import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class  Sidebar extends JPanel {
    private List<SidebarButton> buttons;
    private SidebarButtonListener listener;

    public Sidebar(SidebarButtonListener listener) {
        this.listener = listener;
        this.buttons = new ArrayList<>();
        initializeUI();
    }

    private void initializeUI() {
        setBackground(new Color(50, 50, 50));
        setPreferredSize(new Dimension(200, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        createButtons();
        addButtonsToPanel();
    }

    private void createButtons() {
        buttons.add(new SidebarButton("Home", this::handleButtonClick));
        buttons.add(new SidebarButton("Characters", this::handleButtonClick));
        buttons.add(new SidebarButton("Tier List", this::handleButtonClick));
        buttons.add(new SidebarButton("MOC", this::handleButtonClick));
        buttons.add(new SidebarButton("LC", this::handleButtonClick));
        buttons.add(new SidebarButton("Relic", this::handleButtonClick));
        buttons.add(new SidebarButton("Guides", this::handleButtonClick));
        buttons.add(new SidebarButton("Tools", this::handleButtonClick));
    }

    private void addButtonsToPanel() {
        add(Box.createVerticalStrut(10));
        for (SidebarButton button : buttons) {
            add(button);
            add(Box.createVerticalStrut(10));
        }
    }

    private void handleButtonClick(ActionEvent e) {
        SidebarButton button = (SidebarButton) e.getSource();
        if (listener != null) {
            listener.buttonClicked(button.getButtonName());
        }
    }

    public interface SidebarButtonListener {
        void buttonClicked(String buttonName);
    }
}