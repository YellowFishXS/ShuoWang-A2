public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        // assignmentTwo.partThree();
        //assignmentTwo.partFourA();
        // assignmentTwo.partFourB();
        assignmentTwo.partFive();
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
        Employee operator = new Employee("Zhaoliu", 41, "female", "004", "Ride Operator");

        Ride rollerCoaster3 = new Ride(operator, true,"Thunder Storm", 4);
        System.out.println("create " + rollerCoaster3.getRideName() + " success. Max Rider:" + rollerCoaster3.getmaxRider());

        Visitor jack = new Visitor("Jack", "male", 25, "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female", 22, "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30, "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26, "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24, "independent", "Student");
        Visitor visitor7 = new Visitor("visitor7", "male", 25, "independent", "Adult");
        Visitor visitor8 = new Visitor("visitor8", "female", 22, "CITS", "Student");
        Visitor visitor9 = new Visitor("visitor9", "female", 30, "WOT", "Adult");
        Visitor visitor10 = new Visitor("visitor10", "male", 28, "MT", "VIP");
        Visitor visitor11 = new Visitor("visitor11", "male", 26, "CITS", "Adult");
        Visitor visitor12 = new Visitor("visitor12", "female", 24, "independent", "Student");

        rollerCoaster3.addVisitorToQueue(jack);
        rollerCoaster3.addVisitorToQueue(leo);
        rollerCoaster3.addVisitorToQueue(nehemia);
        rollerCoaster3.addVisitorToQueue(jason);
        rollerCoaster3.addVisitorToQueue(sharon);
        rollerCoaster3.addVisitorToQueue(benny);
        rollerCoaster3.addVisitorToQueue(visitor7);
        rollerCoaster3.addVisitorToQueue(visitor8);
        rollerCoaster3.addVisitorToQueue(visitor9);
        rollerCoaster3.addVisitorToQueue(visitor10);
        rollerCoaster3.addVisitorToQueue(visitor11);
        rollerCoaster3.addVisitorToQueue(visitor12);
        System.out.println("add visitors to Queue finish.");

        System.out.println();
        rollerCoaster3.runOneCycle();

        System.out.println();
        rollerCoaster3.printQueue();

        System.out.println();
        rollerCoaster3.printRideHistory();

        
    }

    public void partSix() {
    }

    public void partSeven() {
    }

}