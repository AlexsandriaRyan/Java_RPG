package FrameAndPanels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

public class SplashPanel extends JPanel {

// ---------- VARIABLES ----------------------------------------

    public JButton buildCharacter;

// ---------- CONSTRUCTOR ----------------------------------------

    public SplashPanel () {

        setBackground(Color.PINK);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(50,0,0,0);

        //add title
        JLabel title = new JLabel("Dungeons and Dragons");
        title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(title, constraints);

        // add image
        JLabel image = new JLabel();
        image.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Dragons.png"))));
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(image, constraints);

        // add button
        buildCharacter = new JButton("Build A Character");
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(buildCharacter, constraints);
    }
}
