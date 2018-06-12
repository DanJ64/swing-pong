/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

/**
 *
 * @author 1_daw8_20
 */
public class Pelota extends Sprite {
    public static final int EN_JUEGO = 0;
    public static final int DERECHA = 1;
    public static final int IZQUIERDA = 2;
    
    int iX;
    int iY;
    int estado;
    Sprite pala1;
    Sprite pala2;
    
    public Pelota(Sprite pala1, Sprite pala2){
        super("bola.png", 400, 300);
        setWidth(100);
        setHeight(100);
        iX = 1;
        iY = -3;
        this.pala1 = pala1;
        this.pala2 = pala2;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void mover(){
        
        if(getY() - getHeight() / 2 < 60 || getY() + getHeight() / 2 > 600 - 30){
            iY = -iY;
        }
        
        if(colisiona(pala1) || colisiona(pala2)){
            iX = -iX;
        }
        
        if(x > 800){
            estado = DERECHA;
        }
        
        if(x < 0){
            estado = IZQUIERDA;
        }
        
        x += iX;
        y += iY;
    }
}
