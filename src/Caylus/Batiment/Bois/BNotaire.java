package Caylus.Batiment.Bois;

import Caylus.Batiment.Batiment;
import Caylus.View;

import java.util.ArrayList;

public class BNotaire extends Batiment {
    private String choix;
    private String recOuvrier;

    /**
     * Constructeur initialisant le nom
     */
    public BNotaire(){
        super("BNotaire");
        coutConst[0]=0;
        coutConst[1]=0;
        coutConst[2]=0;
        coutConst[3]=1;
        coutConst[4]=1;
        prestige=4;
    }

    public int active(View view) {
        recompenseProprietaire();
        if(!recompenseOuvrier())
            return -1;
        return 0;
    }

    /**
     *  Donne la récompense ouvrière dû au joueur
     */
    public boolean recompenseOuvrier() {
        if(ouvrier.donne("denier", 2) && ouvrier.donne("tissu", 1) ){
            return ouvrier.fabriqueBat("Residence");
        }
        return false;
    }
}
