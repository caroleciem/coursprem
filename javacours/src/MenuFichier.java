import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuFichier {

    public static void main(String[] args) {

        System.out.println("Menu : \n");
        System.out.println("1 : Nombre premier\n");
        System.out.println("2 : Palindrome\n");
        System.out.print("\n");
        System.out.println("Quel est votre choix ?");
        try (Scanner clavier = new Scanner(new File(args[0]))) {
            int i = clavier.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("1 : Nombre premier\n");
                    nbrePremierEcran();

                    break;
                }
                case 2: {
                    System.out.println("2 : Palindrome\n");
                    saisiePalindrome();
                    break;
                }
                default: {
                    System.out.println("Ce choix n'est pas dans la liste");

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("erreur de fichier !");

        }

    }



    public static void nbrePremierEcran() {
        boolean saisiePremier = false;
        while (saisiePremier == false) {
            Scanner clavierPremier = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre entier :");

            try {
                int i = clavierPremier.nextInt();
                saisiePremier = true;
                if (NbrePremier.premier(i) == true) {
                    System.out.println("c'est un nombre premier");
                } else {
                    System.out.println("ce n'est pas un nombre entier");
                }
                System.out.println(NbrePremier.listePrem(i));
            } catch (InputMismatchException e) {
                System.out.println("ce n'est pas un entier !");
                clavierPremier.nextLine();
            }
        }
    }

    public static void saisiePalindrome() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("veuillez saisir votre mot :");
        String line = clavier.nextLine();
        RegleGraduee.palindrome(line);
    }
}
