import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean saisie = false;
        while (saisie == false) {
            System.out.println("Menu : \n");
            System.out.println("1 : Nombre premier\n");
            System.out.println("2 : Palindrome\n");
            System.out.print("\n");
            System.out.println("Quel est votre choix ?");
            Scanner clavier = new Scanner(System.in);
            try {
                int i = clavier.nextInt();
                saisie = true;
                switch (i) {
                    case 1: {
                        System.out.println("1 : Nombre premier\n");
                        nbrePremierEcran();

                        break;
                    }
                    case 2:{
                        System.out.println("2 : Palindrome\n");
                        saisiePalindrome();
                        break;
                    }
                    default: {
                        saisie = false;
                        System.out.println("Ce choix n'est pas dans la liste");
                        clavier.nextLine();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("ce n'est pas un entier !");
                clavier.nextLine();

            }

        }
    }
    public static void nbrePremierEcran () {
        boolean saisiePremier = false;
        while (saisiePremier == false) {
            Scanner clavierPremier = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre entier :");

            try {
                int i = clavierPremier.nextInt();
                saisiePremier = true;
                if (NbrePremier.premier(i) == true){
                    System.out.println ("c'est un nombre premier");
                }else{
                    System.out.println("ce n'est pas un nombre entier");
                }
                System.out.println(NbrePremier.listePrem(i));
            } catch (InputMismatchException e) {
                System.out.println("ce n'est pas un entier !");
                clavierPremier.nextLine();
            }
        }
    }
    public static void saisiePalindrome () {
            Scanner clavier =new Scanner(System.in);
            System.out.println ("veuillez saisir votre mot :");
            String line = clavier.nextLine();
            RegleGraduee.palindrome(line);
    }
}
