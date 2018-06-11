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
    int height;

    public Sprite(String src, int x, int y) {
        try {
            img = ImageIO.read(new File(src)); // Lee el fichero
            width = img.getWidth();
            height = img.getHeight();
        } catch (IOException e) { // Si hay problemas 

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
        g.drawImage(img, x, y, width, height, null);

    }

}
