package Caylus.Batiment.Prestige;

import Caylus.Batiment.Batiment;

public class Statue extends Batiment {

    /**
     * Constructeur initialisant le nom, les couts de construction et le nombre de prestiges reçue à la construction
     */
    public Statue(){
        super("Statue");
        coutConst[0]=1;
        coutConst[1]=0;
        coutConst[2]=2;
        coutConst[3]=0;
        coutConst[4]=0;
        prestige=7;
    }

}
