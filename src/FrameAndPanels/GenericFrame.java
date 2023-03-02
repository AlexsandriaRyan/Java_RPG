package FrameAndPanels;

import Classes.Character;
import Classes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenericFrame extends JFrame implements ActionListener {

// ---------- VARIABLES ----------------------------------------

    SplashPanel splashPanel;
    CreationPanel creationPanel;
    BattlePanel battlePanel;

// ---------- CONSTRUCTOR ----------------------------------------

    public GenericFrame() {

        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 700);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainPanel.setLayout(new CardLayout(0, 0));
        setContentPane(mainPanel);

        // add splash panel
        splashPanel = new SplashPanel();
        splashPanel.setVisible(true);
        splashPanel.buildCharacter.addActionListener(this);
        add(splashPanel);

        // add creation panel
        creationPanel = new CreationPanel();
        creationPanel.startBattle.addActionListener(this);
        add(creationPanel);
    }

// ---------- ACTION LISTENER METHOD ----------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        //visibility
        if (e.getSource() == splashPanel.buildCharacter) {
            splashPanel.setVisible(false);
            creationPanel.setVisible(true);

        } else if (e.getSource() == creationPanel.startBattle) {
            battlePanel = new BattlePanel(creationPanel.player);
            battlePanel.playAgain.addActionListener(this);
            add(battlePanel);

            creationPanel.setVisible(false);
            battlePanel.setVisible(true);

        } else if (e.getSource() == battlePanel.playAgain) {
            dispose();
            GenericFrame launchGame = new GenericFrame();
            launchGame.setVisible(true);
        }
    }
}