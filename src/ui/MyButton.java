package ui;

import java.awt.*;

public class MyButton {

    private int x,y,height,width;
    private String text;
    private Rectangle bounds;

    public MyButton(String text,int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.text = text;

        initBounds();
    }

    public void initBounds(){
        this.bounds = new Rectangle(x,y,width,height);
    }

    public void draw(Graphics g){

        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);
        drawText(g);
    }

    public void drawText(Graphics g){
        int w = g.getFontMetrics().stringWidth(text);
        int h = g.getFontMetrics().getHeight();
        g.drawString(text,x - w / 2 + width / 2,y + h / 2 + height / 2);
    }

    public Rectangle getBounds(){
        return bounds;
    }


}
