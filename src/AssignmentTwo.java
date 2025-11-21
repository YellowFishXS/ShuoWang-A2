public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        // assignmentTwo.partThree();
        //assignmentTwo.partFourA();
        assignmentTwo.partFourB();
    }

    public void partThree() {
        Employee operator = new Employee("zhangsan", 45, "male", "001", "Ride Operator");

        Ride rollerCoaster = new Ride(operator, true,  "roller coaster",2);
        System.out.println("create " + rollerCoaster.getRideName() + " success.");

        Visitor jack = new Visitor("Jack", "male", 25, "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female", 22, "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30, "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26, "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24, "independent", "Student");
        System.out.println("crete visitors success.");

        rollerCoaster.addVisitorToQueue(jack);
        rollerCoaster.addVisitorToQueue(leo);
        rollerCoaster.addVisitorToQueue(nehemia);
        rollerCoaster.addVisitorToQueue(jason);
        rollerCoaster.addVisitorToQueue(sharon);
        rollerCoaster.addVisitorToQueue(benny);
        System.out.println("add visitors to queue finish.");

        // for split
        System.out.println();
        System.out.println("before remove");
        rollerCoaster.printQueue();

        System.out.println();
        rollerCoaster.removeVisitorFromQueue();

        System.out.println();
        System.out.println("after remove");
        rollerCoaster.printQueue();

    }

    public void partFourA() {
        Employee operator = new Employee("Lisi", 36, "female", "002", "Ride Operator");

        Ride rollerCoaster1 = new Ride(operator, true,"roller coaster", 3);
        System.out.println("create " + rollerCoaster1.getRideName() + " success.");

        Visitor jack = new Visitor("Jack", "male", 25, "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female", 22, "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30, "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26, "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24, "independent", "Student");

        rollerCoaster1.addVisitorToHistory(jack);
        rollerCoaster1.addVisitorToHistory(leo);
        rollerCoaster1.addVisitorToHistory(nehemia);
        rollerCoaster1.addVisitorToHistory(jason);
        rollerCoaster1.addVisitorToHistory(sharon);
        rollerCoaster1.addVisitorToHistory(benny);
        System.out.println("add visitors to collection finish.");

        //for split
        System.out.println();
        rollerCoaster1.checkVisitorFromHistory(nehemia);
        System.out.println();
        rollerCoaster1.numberOfVisitors();
        System.out.println();
        rollerCoaster1.printRideHistory();

    }

    public void partFourB() {
        Employee operator = new Employee("Wangwu", 39, "male", "003", "Ride Operator");

        Ride rollerCoaster2 = new Ride(operator, true,"Thunder Storm", 3);
        System.out.println("create " + rollerCoaster2.getRideName() + " success.");

        Visitor jack = new Visitor("Jack", "male", 25, "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female", 22, "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30, "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26, "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24, "independent", "Student");

        rollerCoaster2.addVisitorToHistory(jack);
        rollerCoaster2.addVisitorToHistory(leo);
        rollerCoaster2.addVisitorToHistory(nehemia);
        rollerCoaster2.addVisitorToHistory(jason);
        rollerCoaster2.addVisitorToHistory(sharon);
        rollerCoaster2.addVisitorToHistory(benny);
        System.out.println("add visitors to collection finish.");

        //for split
        System.out.println();
        rollerCoaster2.printRideHistory();
        System.out.println();
        VisitorComparator visitorComparator = new VisitorComparator();
        rollerCoaster2.sortRideHistory(visitorComparator);
        //print again
        rollerCoaster2.printRideHistory();
        
    }

    public void partFive() {
        
    }

    public void partSix() {
    }

    public void partSeven() {
    }

}