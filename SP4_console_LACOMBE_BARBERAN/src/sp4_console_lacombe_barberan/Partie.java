/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Baptiste
 */
public class Partie {

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu;

    public Partie(Joueur joueur1, Joueur joueur2) {

        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
        joueurCourant = null;
    }

    public void attribuerCouleursAuxJoueurs() {
        // couleur Jaune attribué à 0
        // couleur Jaune attribué à 1 
        Random r = new Random();
        int n = r.nextInt(1);
        if (n == 0) {
            ListeJoueurs[0].Couleur = "Jaune";
            ListeJoueurs[1].Couleur = "Rouge";
        } else {
            ListeJoueurs[0].Couleur = "Rouge";
            ListeJoueurs[1].Couleur = "Jaune";
        }

    }

    public void initialiserPartie() {
        Random r = new Random();

//creation des jetons joueur1
        for (int i = 0; i <= 20; i++) {
            Jeton jeton = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton);

        }
        //creation des jetons joueur1
        for (int j = 0; j <= 20; j++) {
            Jeton jeton = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[1].ajouterJeton(jeton);

        }
        //placer les trous noir 
        for (int k = 0; k < 5; k++) {

            int a = r.nextInt(5);    //tirer aleatoirement un entier  
            int b = r.nextInt(6);
            grillejeu.placerTrouNoir(a, b);
}

    }
}
