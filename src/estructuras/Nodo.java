/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
import java.awt.Graphics;
/**
 * @author Cielo PM
 */
public class Nodo {
    public int x, y;
    public static final int d=60;
    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void pintar(Graphics g) {
        g.drawOval(this.x-d/2, this.y-d/2, d, d);
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
}
