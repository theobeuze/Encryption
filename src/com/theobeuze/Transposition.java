package com.theobeuze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by theobeuze on 28/12/2016.
 */
public class Transposition {

    private String texte = "";

    private String texteEncrypt = "";

    private String key;

    public void encryptMessage() {
        initTexte();
        System.out.println(texte);
    }

    private void initTexte() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez indiquer le path du fichier contenant le message (sur une seule ligne) :");
        String chemin = sc.nextLine();

        try {
            BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
            String chaine;

            while((chaine = fichier_source.readLine())!= null)
            {
                texte = chaine;
            }
            fichier_source.close();
        } catch (IOException e) {
            System.out.println("Le fichier est introuvable !");
        }

        texte = texte.replaceAll(" ","");
        texte = texte.replaceAll("'","");
    }
}
