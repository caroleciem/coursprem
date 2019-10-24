import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        int nbreEssai = Integer.parseInt(args[0]);
        String[] questions = {"Quel langage à typage statique avez-vous vu en formation ?", "Quel IDE utilisez-vous ?", "Quel langage à typage dynamique avez-vous vu en formation ?"};
        String[] reponses = {"Java", "IntelliJ", "Python"};
        int[] points = {3, 1, 2};
        int nbreRealise = 0;
        boolean nvEssai= true;
        while (nvEssai == true) {
            boolean pointACompter = false;
            int score = 0;
            int scoreMax = 0;
            for (int i = 0; i < questions.length; i++) {
                String question = questions[i];

                poseLaQuestion(question);
                String reponse = recupereLaReponse();
                String reponseOk = reponses[i];
                reponse = reponse.toUpperCase();
                reponseOk = reponseOk.toUpperCase();
                pointACompter = verifieLaReponse(reponse, reponseOk);
                if (pointACompter) {
                    score += points[i];
                }
                scoreMax += points[i];

            }
            System.out.println(" Votre score est : " + score + " sur "+scoreMax);
            nbreRealise++;
            if (nbreRealise <= nbreEssai && score < scoreMax){
                System.out.println ("nouvel essai!");
            }else{
                nvEssai = false;
            }


        }/*
        comptabiliseLesPoints();
        proposeNouvelEssai();*/
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
