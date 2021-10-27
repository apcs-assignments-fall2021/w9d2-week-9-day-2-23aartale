public class Person {
    //instance variables
    private String firstName;
    private String lastName;

    //constructors
    public Person (String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }
    public void doSomething(){
        System.out.println("I am watching Netflix");
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
