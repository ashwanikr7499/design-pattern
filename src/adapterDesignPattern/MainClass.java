package adapterDesignPattern;

public class MainClass {

    public static void main(String[] args) {
        Pen p=new PenAdapter();
        Assignment assignment=new Assignment();
        assignment.setP(p);
        assignment.writeAssignment("Hello");
    }

}
