package Seminar;

public class MainSeminar {
    public static void main(String[]args){
        Person customer= new Person("Clark", "Kent", 42);
        Person coach= new Person("Bernard", "coach" ,25);
        Person customer1 =new Person("carole", "test", 18);
        Person toto = new Person("toto", "titi",24);

        Person[] attendents = new Person[]{customer, customer1,toto};

        Seminar essai = new Seminar(coach,attendents);

        Seminar essai1 = new Seminar(essai);

        System.out.println(essai.equals(essai1));
        System.out.println(coach);
        System.out.println(essai);
        System.out.println(essai1);
        System.out.println(essai.equals(essai1));
        System.out.println(essai.attendents[2].getFirstname());
        System.out.println(essai1.attendents[2].getFirstname());

        essai.attendents[2].setFirstname("Bernard2");
        System.out.println(coach);
        System.out.println(essai);
        System.out.println(essai1);
        System.out.println(essai.equals(essai1));
        System.out.println(essai.attendents[2].getFirstname());
        System.out.println(essai1.attendents[2].getFirstname());


    }
}
