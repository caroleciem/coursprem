package co.simplon;

public class TestItem {
    private String question;
    private String reponse ;
    private int points;


    public TestItem(String question, String reponse, int points){
        this.question = question;
        this.reponse = reponse;
        this.points = points;
    }
    public String toString(){
        return "Question : " + this.question +
                "\nReponse : " +this.reponse +
                "\npour " + this.points +"points.";

    }

    public  String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
