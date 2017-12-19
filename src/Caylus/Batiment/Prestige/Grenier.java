package Caylus.Batiment.Prestige;

import Caylus.Batiment.Batiment;

public class Grenier extends Batiment {

    /**
     * Constructeur initialisant le nom, les couts de construction et le nombre de prestiges reçue à la construction
     */
    public Grenier(){
        super("Grenier");
        coutConst[0]=1;
        coutConst[1]=3;
        coutConst[2]=0;
        coutConst[3]=0;
        coutConst[4]=0;
        prestige=10;
    }

}
