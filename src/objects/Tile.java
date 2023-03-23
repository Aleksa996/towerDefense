package objects;

import java.awt.image.BufferedImage;

public class Tile {

    private BufferedImage sprite;

    public Tile(BufferedImage sprite){
        this.sprite = sprite;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }


}
