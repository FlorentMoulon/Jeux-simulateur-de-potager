import java.util.Observable;

public class Potager extends Observable implements Runnable {
    final int HAUTEUR = 10;
    final int LARGEUR = 10;

    private int vitesse;

    private Case cases[][];

    private ConditionEnvironementale conditionGlobale;

    public Potager() {
        Ordonnanceur.getOrdonnanceur().addRunable(this);
        this.conditionGlobale = new ConditionEnvironementale(50, 50, 50);
        this.vitesse = 1;
        this.cases = new Case[HAUTEUR][LARGEUR];

        for (int i = 0; i < HAUTEUR; i++) {
            for (int j = 0; j < LARGEUR; j++) {
                if(i==0 && j==0) this.cases[i][j] = new Culture();
                else this.cases[i][j] = new Case();
            }
        }

    }

    public void planter(Plante plante, int yCase, int xCase) {
        if (yCase >= 0 && yCase < HAUTEUR && xCase >= 0 && xCase < LARGEUR) {
            if (!(this.cases[yCase][xCase] instanceof Culture)) {
                this.cases[yCase][xCase] = new Culture(plante, this.conditionGlobale);
            }
        }
    }

    public void recolter(int yCase, int xCase) {
        if (yCase >= 0 && yCase < HAUTEUR && xCase >= 0 && xCase < LARGEUR) {
            if (this.cases[yCase][xCase] instanceof Culture) {
                this.cases[yCase][xCase] = new Case();
            }
        }
    }

    public boolean estUneculture(int yCase, int xCase) {
        //System.out.println("Y : " + yCase + "X : " + xCase);
        if (yCase >= 0 && yCase < HAUTEUR && xCase >= 0 && xCase < LARGEUR) {
            //this.cases[yCase][xCase].afficher();
            return this.cases[yCase][xCase] instanceof Culture;
        }
        return false;
    }

    public int getDeveloppement(int yCase, int xCase){
        if (yCase >= 0 && yCase < HAUTEUR && xCase >= 0 && xCase < LARGEUR) {
            //TODO:aucasouarevoir
            if (estUneculture(yCase, xCase)) {
                Culture tmp = (Culture)this.cases[yCase][xCase]; 
                return (tmp.getDeveloppement());
            }
        }
        return -1;
    }

    public void afficher() {
        System.out.println("-------------------");
        System.out.println("AFFICHAGE DE POTAGER");
        System.out.println("HAUTEUR: " + HAUTEUR);
        System.out.println("LARGEUR: " + LARGEUR);
        System.out.println("vitesse: " + this.vitesse);
        System.out.println("condition globale: " + this.conditionGlobale);
        System.out.println("-------------------");
    }

    @Override
    public void run() {
        //System.out.println("Je suis dans le run de potager");

    }
}
