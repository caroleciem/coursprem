package Seminar;

import java.util.Arrays;

public class Seminar {
    Person coach;
    Person[] attendents;
    // constructeur pour initialiser
    public Seminar(Person coach, Person[] attendents) {
        this.coach = coach;
        this.attendents = attendents;
    }


    public boolean equals(Object other) {
        if (other != null && (other instanceof Seminar)) {
            Seminar otherSeminar = (Seminar) other;
            if (this.attendents.length != otherSeminar.attendents.length) {return false;}
            if ((coach.equals(otherSeminar.coach)
                    &&
                    (Arrays.equals(attendents, otherSeminar.attendents)))) {
                return true;
            }

        }
        return false;
        /* on pouvait faire
        if (other != null && (other instanceof Seminar)) {
            Seminar otherSeminar = (Seminar) other;
            return coach.equals(otherSeminar.coach)
             && Arrays.deepaEquals(attendents,otherSeminar.attendents);
         */
    }
    //copie profonde
    public Seminar(Seminar objACopier) {
        coach = new Person(objACopier.coach);
        //copie profonde d'un tableau
        attendents = new Person[objACopier.attendents.length];

        for (int j = 0; j != objACopier.attendents.length; ++j) {
            //on construit l'objet par copie
           attendents[j] = new Person(objACopier.attendents[j]);
            //attendents[j] = objACopier.attendents[j];  ne fonctionne pas car on copie la référence
        }
    }

        public String toString () {
            String res;
            res = "COACH: " + this.coach +
                    "\nAttendents : ";
            for (int i = 0; i < attendents.length; i++) {
                res += attendents[i] + " ";
            }
            return res;
        }

    public void setCoach(Person coach) {
        this.coach = coach;
    }

    public void setAttendents(Person[] attendents) {
        this.attendents = attendents;
    }

    public Person getCoach() {
        return coach;
    }

    public Person[] getAttendents() {
        return attendents;
    }
}
