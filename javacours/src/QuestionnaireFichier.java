import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionnaireFichier {
    public static void main(String[] args) {
        int nbreEssai = Integer.parseInt(args[0]);
        /*String[] questions = {"Quel langage à typage statique avez-vous vu en formation ?", "Quel IDE utilisez-vous ?", "Quel langage à typage dynamique avez-vous vu en formation ?"};
        String[] reponses = {"Java", "IntelliJ", "Python"};
        int[] points = {3, 1, 2};*/
        int nbreRealise = 0;
        String[][] tableau = new String[100][3];

        boolean pointACompter = false;
        int score = 0;
        int scoreMax = 0;
        try (Scanner sc = new Scanner(new File("./src/question.txt"))) {

                for (int i = 0; sc.hasNextLine(); ++i) {
                    String ligne = sc.nextLine();
                    String[] ligneTableau = ligne.split(";");//transforme par exemple "aaa;bbb;ccc" en {"aaa","bbb","ccc"}
                    tableau[i] = ligneTableau;
                    String question = tableau[i][0];
                    poseLaQuestion(question);
                    String reponse = recupereLaReponse();
                    String reponseOk = tableau[i][1];
                    reponse = reponse.toUpperCase();
                    reponseOk = reponseOk.toUpperCase();
                    pointACompter = verifieLaReponse(reponse, reponseOk);
                    String pointsS = tableau[i][2];
                    int points = Integer.valueOf(pointsS);
                    //int points = 2;
                    if (pointACompter) {
                        score += points;
                    }
                    scoreMax += points;

                }
                System.out.println(" Votre score est : " + score + " sur " + scoreMax);



        } catch (FileNotFoundException e) {
            System.out.println("fichier inexistant");
        }

    }





    public static void poseLaQuestion(String question) {
        System.out.println(question);
    }

    public static String recupereLaReponse() {
        Scanner clavier = new Scanner(System.in);
        String reponse = clavier.nextLine();
        return reponse;
    }

    public static boolean verifieLaReponse(String reponse, String reponseOk) {
        boolean bonneReponse = false;
        if (reponse.equals(reponseOk)) {
            bonneReponse = true;
        }
        return bonneReponse;

    }


}
