package FrameAndPanels;

import Classes.Cleric;
import Classes.Druid;
import Classes.Rogue;
import Classes.Monster;
import Classes.Player;
import Classes.Weapon;
import FrameAndPanels.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

public class BattlePanel extends JPanel {

// ---------- VARIABLES ----------------------------------------------------------

    private JLabel title = new JLabel("Battle to the Death!");
    public JLabel playerLabel = new JLabel();
    public JLabel monsterLabel = new JLabel();
    public JLabel playerImage = new JLabel();
    public JLabel monsterImage = new JLabel();
    private JTextArea report = new JTextArea();
    public JButton playAgain = new JButton("Play Again");

    public BattlePanel(Player player) {
        System.out.println("In battle panel, the character's name is: " + player.getCharName());
        Monster monster = new Monster();
        monster.setMonsterName();
        monster.modStats();

        setBackground(Color.PINK);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        Font font = new Font("Montserrat", Font.BOLD, 14);
        Font header = new Font("Copperplate Gothic Bold", Font.BOLD, 24);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);

        //title
        title.setFont(header);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        add(title, gbc);

        // player
        playerLabel.setText("Player: " + player.getCharName());
        playerLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(playerLabel, gbc);

        if (player.charType.equals("Cleric")) {
            playerImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Cleric.png"))));
        } else if (player.charType.equals("Druid")) {
            playerImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Druid.png"))));
        } else if (player.charType.equals("Rogue")) {
            playerImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Rogue.png"))));
        }
        playerImage.setBorder(BorderFactory.createLineBorder(Color.decode("#fa7f7f")));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(playerImage, gbc);

        // monster
        monsterLabel.setText("Monster: " + monster.getMonsterName());
        monsterLabel.setFont(font);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(monsterLabel, gbc);

        if (monster.monsterName.equals("Jeff Bezos")) {
            monsterImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Bezos.png"))));
        } else if (monster.monsterName.equals("Bill Gates")) {
            monsterImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Gates.png"))));
        } else if (monster.monsterName.equals("Mark Zuckerberg")) {
            monsterImage.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/Zuck.png"))));
        }
        monsterImage.setBorder(BorderFactory.createLineBorder(Color.decode("#fa7f7f")));
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(monsterImage, gbc);

        report.setText(String.format("Player: %s " +
                "\nClass: %s\tHP: %d\tDefense: %d\tAgility:%d\tBaseAtk: %d " +
                "\nWeapon: %s\t\tWeight: %d\tAttackMod: %d" +
                "\n--- " +
                "\nMonster: %s" +
                "\nHP: %d\tDefense: %d\tAgility:%d\tBaseAtk: %d",
                player.getCharName(),
                player.getCharType(),
                player.getHp(),
                player.getDef(),
                player.getAgil(),
                player.getAtk(),
                player.weapon.getType(),
                player.weapon.getWeight(),
                player.weapon.getAtk(),
                monster.getMonsterName(),
                monster.getHp(),
                monster.getDef(),
                monster.getAgil(),
                monster.getAtk()
                ));
        report.setOpaque(true);
        report.setEditable(false);
        report.setBackground(Color.WHITE);
        report.setBorder(BorderFactory.createLineBorder(Color.decode("#fa7f7f")));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.gridheight = 10;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        add(report, gbc);

        playAgain.setBorder(BorderFactory.createLineBorder(Color.decode("#e3a600")));
        playAgain.setBackground(Color.decode("#e3bd00"));
        playAgain.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 3;
        gbc.ipadx = 15;
        gbc.ipady = 15;
        gbc.fill = GridBagConstraints.NONE;
        add(playAgain, gbc);
    }
}