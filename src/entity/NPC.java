package entity;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class NPC extends Entity{

    public NPC(GamePanel gp){
        super(gp);
        direction="right";
        speed=1;

    }
    public void getNPCImage(){
        try {
            right1= ImageIO.read(getClass().getResourceAsStream("/npc/right1.png"));
            right2= ImageIO.read(getClass().getResourceAsStream("/npc/right2.png"));
            left1= ImageIO.read(getClass().getResourceAsStream("/npc/left1.png"));
            left2= ImageIO.read(getClass().getResourceAsStream("/npc/left2.png"));
            down1= ImageIO.read(getClass().getResourceAsStream("/npc/down1.png"));
            down2= ImageIO.read(getClass().getResourceAsStream("/npc/down2.png"));
            up1= ImageIO.read(getClass().getResourceAsStream("/npc/up1.png"));
            up2= ImageIO.read(getClass().getResourceAsStream("/npc/up2.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
