// Alexsandria Ryan
// PROG 1400
// December 2022

import FrameAndPanels.GenericFrame;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
                GenericFrame launchGame = new GenericFrame();
                launchGame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}