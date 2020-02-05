public class PersonInfo {

    public static void main (String[] args) {

        //creating the object of the class Person
        Person person = new Person("Manqasana", 23, "female",
                new String[] {"reading", "dancing", "listening to music."});

       System.out.println(person.hello()) ;//calling the method

    }
}
