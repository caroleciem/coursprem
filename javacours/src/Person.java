public class Person {
        private String firstname;
        private String lastname;
        private int age;
        public Person(String firstname, String lastname, int age){
            this.firstname= firstname;
            this.lastname= lastname;
            this.age= age;
        }
        public Person(Person Other){
            firstname = Other.firstname;
            lastname =Other.lastname;
            age = Other.age;
        }
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
}
