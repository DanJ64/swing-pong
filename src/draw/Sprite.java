/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author victor
 */
public class Sprite implements Dibujable {

    BufferedImage img;
    int x;
    int y;
    int width;
    private int height;

    public Sprite(String src, int x, int y) {
        try {
            img = ImageIO.read(new File(src)); // Lee el fichero
            width = img.getWidth();
            height = img.getHeight();
        } catch (Exception e) { // Si hay problemas 
            e.printStackTrace();
        }
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(img, x - width / 2, y - height / 2, width, height, null);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public boolean colisiona(Sprite otro){
        Rectangle r1 = new Rectangle(x - width / 2, y - height / 2, width, height);
        Rectangle r2 = new Rectangle(otro.getX() - otro.getWidth() / 2, 
        otro.getY() - otro.getHeight()/ 2, otro.getWidth(), otro.getHeight());
        
        return r1.intersects(r2);
    }
    

}
