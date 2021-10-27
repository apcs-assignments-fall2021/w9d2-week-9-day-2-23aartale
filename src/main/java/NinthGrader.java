public class NinthGrader extends Student {

    public NinthGrader(String firstName, String lastName, int classYear){
        super(firstName, lastName, classYear);
    }

    public NinthGrader(){
        super("Jerry", "Seinfeld", 2024);
    }

    @Override
    public void doSomething(){
        System.out.println("I am preparing for a Harkness discussion!");
    }

    public String toString(){
        return getFirstName() + getlastName() +  ", " + getClassYear() + "(Ninth Grader)";
    }

}
