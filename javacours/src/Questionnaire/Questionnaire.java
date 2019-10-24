package Questionnaire;

import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        int nbreEssai = Integer.parseInt(args[0]);
        /*String[] questions = {"Quel langage à typage statique avez-vous vu en formation ?", "Quel IDE utilisez-vous ?", "Quel langage à typage dynamique avez-vous vu en formation ?"};
        String[] reponses = {"Java", "IntelliJ", "Python"};
        int[] points = {3, 1, 2};*/
        int nbreRealise = 0;
        boolean nvEssai = true;
        TestQuizz item = new TestQuizz("Quel langage à typage statique avez-vous vu en formation ?", "Java", 3);
        TestQuizz item1 = new TestQuizz("Quel IDE utilisez-vous ?", "IntelliJ", 1);
        TestQuizz item2 = new TestQuizz("Quel langage à typage dynamique avez-vous vu en formation ?", "Python", 2);
        while (nvEssai == true) {
            boolean pointACompter = false;
            int score = 0;
            int scoreMax = 0;

            System.out.println(item.getQuestion());
            String reponse = recupereLaReponse();
            reponse = reponse.toUpperCase();
            String reponseOk = (item.getReponse());
            reponseOk = reponseOk.toUpperCase();
            pointACompter = verifieLaReponse(reponse, reponseOk);
            if (pointACompter) {
                score += item.getPoints();
            }
            scoreMax += item.getPoints();
            System.out.println(item1.getQuestion());
            String reponse1 = recupereLaReponse();
            reponse1 = reponse1.toUpperCase();
            String reponseOk1 = (item1.getReponse());
            reponseOk1 = reponseOk1.toUpperCase();
            pointACompter = verifieLaReponse(reponse1, reponseOk1);
            if (pointACompter) {
                score += item1.getPoints();
            }
            scoreMax += item1.getPoints();
            System.out.println(item2.getQuestion());
            String reponse2 = recupereLaReponse();
            reponse2 = reponse2.toUpperCase();
            String reponseOk2 = (item2.getReponse());
            reponseOk2 = reponseOk2.toUpperCase();
            pointACompter = verifieLaReponse(reponse2, reponseOk2);
            if (pointACompter) {
                score += item2.getPoints();
            }
            scoreMax += item2.getPoints();

            System.out.println(" Votre score est : " + score + " sur " + scoreMax);
            nbreRealise++;
            if (nbreRealise < nbreEssai && score < scoreMax) {
                System.out.println("nouvel essai!");
            } else {
                nvEssai = false;
            }
        }
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
