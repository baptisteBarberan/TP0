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

        if (Math.random() * (0 - 1) == 0) {
            ListeJoueurs[0].Couleur = "Jaune";
            ListeJoueurs[1].Couleur = "Rouge";
        } else {
            ListeJoueurs[0].Couleur = "Rouge";
            ListeJoueurs[1].Couleur = "Jaune";
        }

    }

    public void initialiserPartie() {
        //creation des jetons joueur1

        for (int i = 0; i <= 20; i++) {
            Jeton jeton = new Jeton ;
            jeton.Couleur = ListeJoueurs[0].Couleur;
            ListeJoueurs[0].ajouterJeton(jeton);

        }
        //creation des jetons joueur1
        for (int i = 0; i <= 20; i++) {
            Jeton jeton = new Jeton ;
            jeton.Couleur = ListeJoueurs[0].Couleur;
            ListeJoueurs[1].ajouterJeton(jeton);

           }
        //placer les trous noir 
        
        

    }

}
