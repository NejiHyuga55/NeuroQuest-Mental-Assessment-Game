package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class OBJ_Key_Question extends SuperObject {
    private final String question;
    private final String trait;
    private final GamePanel gp;

    public OBJ_Key_Question(GamePanel gp, String question, String trait) {
        this.gp = gp;
        this.question = question;
        this.trait = trait;
        name = "Key";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void askQuestion() {
        String response = JOptionPane.showInputDialog(null, question);
        if (response != null && response.equalsIgnoreCase("yes")) {
            switch (trait.toLowerCase()) {
                case "focus" -> gp.focusScore++;
                case "impulsivity" -> gp.impulsivityScore++;
                case "social" -> gp.socialScore++;
            }
        }
    }
}
