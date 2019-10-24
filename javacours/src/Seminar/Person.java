package Seminar;

public class Person {
        private String firstname;
        private String lastname;
        private int age;
        //constructeur pour affecter
        public Person(String firstname, String lastname, int age){
            this.firstname= firstname;
            this.lastname= lastname;
            this.age= age;
        }
        //constructeur pour la copie profonde (pas besoin de faire new String car string ets immutable
        public Person(Person Other){
            firstname = Other.firstname;
            lastname =Other.lastname;
            age = Other.age;
        }
        //permet d'utiliser equals
        public boolean equals(Object other){
            if(other != null && (other instanceof Person)){
                Person otherPerson= (Person) other;
                if(firstname.equals(otherPerson.firstname)
                        && lastname.equals(otherPerson.lastname)
                        && (age == otherPerson.age)){
                    return true;
                }

            }
            return false;
        }
        //permet l'affichage
        public String toString() {
            return "Firstname : " + this.firstname +
                    "\nlastname : " + this.lastname +
                    "\n age " + this.age;
        }


    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
