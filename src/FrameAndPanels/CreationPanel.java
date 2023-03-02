package FrameAndPanels;

import Classes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CreationPanel extends JPanel implements ActionListener{

// ---------- VARIABLES ----------------------------------------------------------

    // objects...?
    public Player player;
    public Weapon weapon;

    // title
    JLabel title = new JLabel("Character Builder");

    // character information
    JLabel nameLabel            = new JLabel("Enter Name:");
    JLabel charLabel            = new JLabel("Character Type:");
    JTextField nameField        = new JTextField();
    JRadioButton clericButton   = new JRadioButton("Cleric");
    JRadioButton druidButton    = new JRadioButton("Druid");
    JRadioButton rogueButton    = new JRadioButton("Rogue");
    ButtonGroup charButtons     = new ButtonGroup();
    JTextArea charDescription   = new JTextArea(5,15);
    JLabel charImage            = new JLabel();

    // character stats
    JLabel cStatsLabel      = new JLabel("Character Stats:");
    JLabel hpLabel          = new JLabel("Hit Points:");
    JLabel defLabel         = new JLabel("Defense:");
    JLabel agilLabel        = new JLabel("Agility:");
    JLabel baseAtkLabel     = new JLabel("Base Attack:");
    JTextField hpField      = new JTextField(5);
    JTextField defField     = new JTextField(5);
    JTextField agilField    = new JTextField(5);
    JTextField baseAtkField = new JTextField(5);
    JButton reroll          = new JButton("Reroll Stats");

    // weapon information
    JLabel weaponLabel          = new JLabel("Select Your Weapon:");
    JRadioButton crossbowButton = new JRadioButton("Crossbow");
    JRadioButton maceButton     = new JRadioButton("Mace");
    JRadioButton swordButton    = new JRadioButton("Sword");
    ButtonGroup weaponButtons   = new ButtonGroup();
    JTextArea weaponDescription = new JTextArea(5,15);
    JLabel weaponImage          = new JLabel();

    // weapon stats
    JLabel wStatsLabel      = new JLabel("Weapon Stats:");
    JLabel atkModLabel      = new JLabel("Attack Modifier:");
    JLabel weightLabel      = new JLabel("Weight:");
    JTextField atkModField  = new JTextField(5);
    JTextField weightField  = new JTextField(5);

    // start button
    JButton startBattle = new JButton("Start Battle!");

// ---------- CONSTRUCTOR --------------------------------------------------------

    public CreationPanel() {

        setBackground(Color.PINK);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        Font font = new Font("Montserrat", Font.BOLD, 14);
        Font header = new Font("Copperplate Gothic Bold", Font.BOLD, 20);
        Color border = Color.decode("#fa7f7f");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // title
        title.setFont(header);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 5, 20, 5);
        add(title, gbc);

        // name
        nameLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 5, 10, 5);
        add(nameLabel, gbc);

        nameField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(nameField, gbc);

        // character
        charLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(charLabel, gbc);

        clericButton.setSelected(true);
        clericButton.setOpaque(false);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        charButtons.add(clericButton);
        add(clericButton, gbc);

        druidButton.setOpaque(false);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        charButtons.add(druidButton);
        add(druidButton, gbc);

        rogueButton.setOpaque(false);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        charButtons.add(rogueButton);
        add(rogueButton, gbc);

        charDescription.setEditable(false);
        charDescription.setLineWrap(true);
        charDescription.setBorder(BorderFactory.createLineBorder(border));
        charDescription.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.BOTH;
        add(charDescription, gbc);

        charImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Temp.png"))));
        charImage.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 20);
        add(charImage, gbc);

        // weapon
        weaponLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(20, 5, 5, 5);
        add(weaponLabel, gbc);

        crossbowButton.setSelected(true);
        crossbowButton.setOpaque(false);
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST;
        weaponButtons.add(crossbowButton);
        gbc.insets = new Insets(5, 5, 5, 5);
        add(crossbowButton, gbc);

        maceButton.setOpaque(false);
        gbc.gridx = 1;
        gbc.gridy = 10;
        weaponButtons.add(maceButton);
        add(maceButton, gbc);

        swordButton.setOpaque(false);
        gbc.gridx = 2;
        gbc.gridy = 10;
        weaponButtons.add(swordButton);
        add(swordButton, gbc);

        weaponDescription.setEditable(false);
        weaponDescription.setLineWrap(true);
        weaponDescription.setBorder(BorderFactory.createLineBorder(border));
        weaponDescription.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.BOTH;
        add(weaponDescription, gbc);

        weaponImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Temp.png"))));
        weaponImage.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 3;
        gbc.gridy = 11;
        gbc.gridwidth = 1;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 20);
        add(weaponImage, gbc);

        // start battle button
        startBattle.setBorder(BorderFactory.createLineBorder(Color.decode("#417546")));
        startBattle.setBackground(Color.decode("#5ba363"));
        startBattle.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.gridheight = 1;
        gbc.gridwidth = 10;
        gbc.ipadx = 15;
        gbc.ipady = 15;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(20, 5, 20, 5);
        add(startBattle, gbc);


        // character stats
        cStatsLabel.setFont(font);
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(cStatsLabel, gbc);

        // hp
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(hpLabel, gbc);

        hpField.setEditable(false);
        hpField.setBackground(Color.WHITE);
        hpField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        add(hpField, gbc);

        // defense
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(defLabel, gbc);

        defField.setEditable(false);
        defField.setBackground(Color.WHITE);
        defField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        add(defField, gbc);

        // agility
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        add(agilLabel, gbc);

        agilField.setEditable(false);
        agilField.setBackground(Color.WHITE);
        agilField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        add(agilField, gbc);

        // base attack
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        add(baseAtkLabel, gbc);

        baseAtkField.setEditable(false);
        baseAtkField.setBackground(Color.WHITE);
        baseAtkField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        add(baseAtkField, gbc);

        // reroll button
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.SOUTH;
        add(reroll, gbc);

        // weapon stats
        wStatsLabel.setFont(font);
        gbc.gridx = 5;
        gbc.gridy = 10;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(20, 5, 5, 5);
        add(wStatsLabel, gbc);

        // attack modifier
        gbc.gridx = 5;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(atkModLabel, gbc);

        atkModField.setEditable(false);
        atkModField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        add(atkModField, gbc);

        // weight modifier
        gbc.gridx = 5;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        add(weightLabel, gbc);

        weightField.setEditable(false);
        weightField.setBorder(BorderFactory.createLineBorder(border));
        gbc.gridx = 7;
        gbc.gridy = 12;
        gbc.gridwidth = 3;
        add(weightField, gbc);

        clericButton.addActionListener(this);
        druidButton.addActionListener(this);
        rogueButton.addActionListener(this);
        crossbowButton.addActionListener(this);
        maceButton.addActionListener(this);
        swordButton.addActionListener(this);
        reroll.addActionListener(this);
        startBattle.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == clericButton || e.getSource() == druidButton || e.getSource() == rogueButton) {
            player = setPlayer();
        } else if (e.getSource() == crossbowButton || e.getSource() == maceButton || e.getSource() == swordButton) {
            weapon = setWeapon();
        }
        //reroll
        if (e.getSource() == reroll) {
            player.modStats();
            hpField.setText(Integer.toString(player.getHp()));
            defField.setText(Integer.toString(player.getDef()));
            agilField.setText(Integer.toString(player.getAgil()));
            baseAtkField.setText(Integer.toString(player.getAtk()));
        }
        if (e.getSource() == startBattle) {
            player = setPlayer();
        }
    }

    public Player setPlayer() {
        Player tempPlayer = null;
        if (clericButton.isSelected()) {
            tempPlayer = new Cleric();
            tempPlayer.modStats();
            tempPlayer.setCharType("Cleric");
            charImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Cleric.png"))));

        } else if (druidButton.isSelected()) {
            tempPlayer = new Druid();
            tempPlayer.modStats();
            tempPlayer.setCharType("Druid");
            charImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Druid.png"))));

        } else if (rogueButton.isSelected()) {
            tempPlayer = new Rogue();
            tempPlayer.modStats();
            tempPlayer.setCharType("Rogue");
            charImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Rogue.png"))));
        }

        charDescription.setText(tempPlayer.getDescription());
        hpField.setText(Integer.toString(tempPlayer.getHp()));
        defField.setText(Integer.toString(tempPlayer.getDef()));
        agilField.setText(Integer.toString(tempPlayer.getAgil()));
        baseAtkField.setText(Integer.toString(tempPlayer.getAtk()));
        tempPlayer.setCharName(nameField.getText());
        if (weapon != null) {
            tempPlayer.setWeapon(weapon);
        }

        return tempPlayer;
    }

    public Weapon setWeapon() {
        Weapon tempWeapon = null;
        if (crossbowButton.isSelected()) {
            tempWeapon = new Crossbow();
            weaponImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Crossbow.png"))));

        } else if (maceButton.isSelected()) {
            tempWeapon = new Mace();
            weaponImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Mace.png"))));

        } else if (swordButton.isSelected()) {
            tempWeapon = new Sword();
            weaponImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Sword.png"))));
        }

        weaponDescription.setText(tempWeapon.getDescription());
        weightField.setText(Integer.toString(tempWeapon.getWeight()));
        atkModField.setText(Integer.toString(tempWeapon.getAtk()));
        if (player != null) {
            player.setWeapon(tempWeapon);
        }

        return tempWeapon;
    }
}