public class Person {

    //declaring instance variables
    private String name;
    private int age;
    private String gender;
    private String[] interest;

    //overloaded constructor
    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }




    //hello() method doesn't return any value
    public void hello()
    {
        //printing my personal info
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old "
        + gender + " . My interest are " + interest[0] + " , " + interest[1] + " and " + interest[2]);
    }
}
