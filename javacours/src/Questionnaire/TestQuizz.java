package Questionnaire;

public class TestQuizz {
    private String question;
    private String reponse;
    private int points;

    public TestQuizz(String question, String reponse,int points){
        this.question =question;
        this.reponse = reponse;
        this.points = points;

    }

    public String getQuestion() {
        return question;
    }

    public int getPoints() {
        return points;
    }

    public String getReponse() {
        return reponse;
    }

}
