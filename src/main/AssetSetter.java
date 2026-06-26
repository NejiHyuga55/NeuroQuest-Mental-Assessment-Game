package main;

import entity.NPC;
import object.*;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Key_Question(gp, "Do you struggle to focus in class? (yes/no)", "focus");
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 10 * gp.tileSize;

        gp.obj[1] = new OBJ_Key_Question(gp, "Do you often make impulsive decisions? (yes/no)", "impulsivity");
        gp.obj[1].worldX = 47 * gp.tileSize;
        gp.obj[1].worldY = 12 * gp.tileSize;

        gp.obj[2] = new OBJ_Door();
        gp.obj[2].worldX = 71 * gp.tileSize;
        gp.obj[2].worldY = 28 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 24 * gp.tileSize;
        gp.obj[3].worldY = 28 * gp.tileSize;

        gp.obj[4] = new OBJ_Boots();
        gp.obj[4].worldX = 81 * gp.tileSize;
        gp.obj[4].worldY = 12 * gp.tileSize;

        gp.obj[5] = new OBJ_Chest();
        gp.obj[5].worldX = 86 * gp.tileSize;
        gp.obj[5].worldY = 28 * gp.tileSize;

        gp.obj[6] = new OBJ_Door();
        gp.obj[6].worldX = 40 * gp.tileSize;
        gp.obj[6].worldY = 63 * gp.tileSize;

        gp.obj[7] = new OBJ_Door();
        gp.obj[7].worldX = 54 * gp.tileSize;
        gp.obj[7].worldY = 63 * gp.tileSize;

        gp.obj[8] = new OBJ_Door();
        gp.obj[8].worldX = 47 * gp.tileSize;
        gp.obj[8].worldY = 41 * gp.tileSize;

        gp.obj[9] = new OBJ_Key_Question(gp, "Do you find social situations uncomfortable? (yes/no)", "social");
        gp.obj[9].worldX = 11 * gp.tileSize;
        gp.obj[9].worldY = 28 * gp.tileSize;

        gp.obj[10] = new OBJ_Key_Question(gp, "Do you feel restless often? (yes/no)", "impulsivity");
        gp.obj[10].worldX = 84 * gp.tileSize;
        gp.obj[10].worldY = 28 * gp.tileSize;

        gp.obj[11] = new OBJ_Key_Question(gp, "Do you enjoy predictable routines? (yes/no)", "focus");
        gp.obj[11].worldX = 26 * gp.tileSize;
        gp.obj[11].worldY = 63 * gp.tileSize;

        gp.obj[12] = new OBJ_Key_Question(gp, "Do you avoid eye contact when speaking? (yes/no)", "social");
        gp.obj[12].worldX = 67 * gp.tileSize;
        gp.obj[12].worldY = 63 * gp.tileSize;
    }
}