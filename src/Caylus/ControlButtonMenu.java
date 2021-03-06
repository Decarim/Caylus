package Caylus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Schnoeby on 25/11/2017.
 */
public class ControlButtonMenu implements ActionListener {
    private ViewMenu viewMenu;
    private BackgroundMusic backgroundMusic;


    /**
     * Initialise le controlleur
     * @param viewMenu La vue du menu de choix du nombre de joueur
     * @param backgroundMusic La musique lancer dans le menu de choix du nombre joueur
     */
    public ControlButtonMenu(ViewMenu viewMenu, BackgroundMusic backgroundMusic) {
        this.viewMenu = viewMenu;
        this.backgroundMusic = backgroundMusic;
        viewMenu.setButtonControler(this);
    }

    /**
     * Action à faire en fonction du bouton cliqué dans le menu du choix nombre joueur
     * @param e Evenement détecté
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewMenu.getQuitter()) {
            System.exit(0);
        } else{
            int nbrJoueurs = 0;
            if (e.getSource() == viewMenu.getDeuxJoueurs()) {
                nbrJoueurs = 2;
            } else if (e.getSource() == viewMenu.getTroisJoueurs()) {
                nbrJoueurs = 3;
            } else if (e.getSource() == viewMenu.getQuatreJoueurs()) {
                nbrJoueurs = 4;
            }else if (e.getSource() == viewMenu.getCinqJoueurs()) {
                nbrJoueurs = 5;
            }
            backgroundMusic.isMenu = false;
            backgroundMusic.run();
            viewMenu.undisplay();
            Model model = new Model(nbrJoueurs);
            ControlGroup controlGroup = new ControlGroup(model, backgroundMusic);
        }

    }
}
