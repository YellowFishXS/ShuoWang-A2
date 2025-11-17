public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
    }

    public void partThree() {
        Employee operator =  new Employee("zhangsan",45,"male","001","Ride Operator");

        Ride rollerCoaster = new Ride(operator, true, 2, "roller coaster");
        System.out.println("create "+ rollerCoaster.getRideName()+" success.");

        Visitor jack = new Visitor("Jack", "male", 25,  "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female",22,  "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30,  "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26,  "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24,  "independent", "Student");
        System.out.println("crete visitors success.");

        rollerCoaster.addVisitorToQueue(jack);
        rollerCoaster.addVisitorToQueue(leo);
        rollerCoaster.addVisitorToQueue(nehemia);
        rollerCoaster.addVisitorToQueue(jason);
        rollerCoaster.addVisitorToQueue(sharon);
        rollerCoaster.addVisitorToQueue(benny);
        System.out.println("add visitors to queue finish.");

        //for split
        System.out.println();
        System.out.println("before remove");
        rollerCoaster.printQueue();

        System.out.println();
        rollerCoaster.removeVisitorFromQueue();

        System.out.println();
        System.out.println("after remove");
        rollerCoaster.printQueue();

    }
    public void partFourA() {}
    public void partFourB() {}
    public void partFive() {}
    public void partSix() {}
    public void partSeven() {}

}