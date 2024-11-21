package composantConcret;

import decorateur.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuerProgramme = true;

        while (continuerProgramme) {
            System.out.println("Bienvenue dans notre café!");

            // Choix de la boisson
            System.out.println("Choisissez votre boisson :");
            System.out.println("1. Espresso (600 Fcfa)");
            System.out.println("2. Deca (500 Fcfa)");
            System.out.println("3. Sumatra (700 Fcfa)");
            System.out.println("4. Colombia (700 Fcfa)");

            int choixBoisson = scanner.nextInt();
            Boisson boisson = null;

            switch (choixBoisson) {
                case 1:
                    boisson = new Espresso();
                    break;
                case 2:
                    boisson = new Deca();
                    break;
                case 3:
                    boisson = new Sumatra();
                    break;
                case 4:
                    boisson = new Colombia();
                    break;
                default:
                    System.out.println("Choix de boisson non valide.");
                    System.exit(1);
            }

            // Choix des décorateurs
            boolean continuerAjout = true;
            while (continuerAjout) {
                System.out.println("Voulez-vous ajouter un Ingredient ? (Oui/Non)");
                String choix = scanner.next().toLowerCase();

                if (choix.equals("oui")) {
                    System.out.println("Choisissez un Ingredient:");
                    System.out.println("1. Chocolat (400 Fcfa)");
                    System.out.println("2. Lait (200 Fcfa)");
                    System.out.println("3. Caramel (800 Fcfa)");
                    System.out.println("4. Chantilly (900 Fcfa)");

                    int choixDecorateur = scanner.nextInt();

                    switch (choixDecorateur) {
                        case 1:
                            boisson = new Chocolat(boisson);
                            break;
                        case 2:
                            boisson = new Lait(boisson);
                            break;
                        case 3:
                            boisson = new Caramel(boisson);
                            break;
                        case 4:
                            boisson = new Chantilly(boisson);
                            break;
                        default:
                            System.out.println("Choix de décorateur non valide.");
                            System.exit(1);
                    }
                } else if (choix.equals("non")) {
                    continuerAjout = false;
                } else {
                    System.out.println("Veuillez répondre par 'Oui' ou 'Non'.");
                }
            }

            // Affichage de la description et du coût final
            System.out.println("Votre commande : " + boisson.getDescription());
            System.out.println("Coût total : " + boisson.cout() + " Fcfa");

            // Option pour arrêter le programme
            System.out.println("Voulez-vous arrêter le programme ? (Oui/Non)");
            String choixArret = scanner.next().toLowerCase();
            if (choixArret.equals("oui")) {
                continuerProgramme = false;
            }
        }

        scanner.close();
    }
}
