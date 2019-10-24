package co.simplon;


public class Main {
    public static void main(String[]args){
        TestItem ti= new TestItem ("Quel IDE","INTELLIJ", 1);
        System.out.println (ti);
        System.out.println (ti.getQuestion());
    }
}
