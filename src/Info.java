/**
 * Created by tgarceno on 26/05/17.
 */
import javax.swing.*;
import java.awt.*;

public class Info extends JPanel {
    private int width, height;

    /**
     * Créer un panel principal avec une image de fond
     * @param width largeur du panel
     * @param height hauteur du panel
     */
    public Info(int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * Dessiner le fond sur le panel
     * @param g graphics
     */
    public void paint(Graphics g) {
        Image img = Toolkit.getDefaultToolkit().getImage("res/img/infos.png");
        g.drawImage(img,0,0,width,height,this);
        setOpaque(false);
        super.paint(g);
        setOpaque(true);
    }

}

