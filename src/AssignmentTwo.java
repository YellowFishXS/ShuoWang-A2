public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        // assignmentTwo.partThree();
        //assignmentTwo.partFourA();
        // assignmentTwo.partFourB();
        // assignmentTwo.partFive();
        // assignmentTwo.partSix();
        assignmentTwo.partSeven();
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

        Ride thunderStorm1 = new Ride(operator, true,"Thunder Storm", 3);
        System.out.println("create " + thunderStorm1.getRideName() + " success.");

        Visitor jack = new Visitor("Jack", "male", 25, "independent", "Adult");
        Visitor leo = new Visitor("Leo", "female", 22, "CITS", "Student");
        Visitor nehemia = new Visitor("Nehemia", "female", 30, "WOT", "Adult");
        Visitor jason = new Visitor("Jason", "male", 28, "MT", "VIP");
        Visitor sharon = new Visitor("Sharon", "male", 26, "CITS", "Adult");
        Visitor benny = new Visitor("Benny", "female", 24, "independent", "Student");

        thunderStorm1.addVisitorToHistory(jack);
        thunderStorm1.addVisitorToHistory(leo);
        thunderStorm1.addVisitorToHistory(nehemia);
        thunderStorm1.addVisitorToHistory(jason);
        thunderStorm1.addVisitorToHistory(sharon);
        thunderStorm1.addVisitorToHistory(benny);
        System.out.println("add visitors to collection finish.");

        //for split
        System.out.println();
        thunderStorm1.printRideHistory();
        System.out.println();
        VisitorComparator visitorComparator = new VisitorComparator();
        thunderStorm1.sortRideHistory(visitorComparator);
        //print again
        thunderStorm1.printRideHistory();
        
    }

    public void partFive() {
        Employee operator = new Employee("Zhaoliu", 41, "female", "004", "Ride Operator");

        Ride thunderStorm2 = new Ride(operator, true,"Thunder Storm", 4);
        System.out.println("create " + thunderStorm2.getRideName() + " success. Max Rider:" + thunderStorm2.getmaxRider());

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

        thunderStorm2.addVisitorToQueue(jack);
        thunderStorm2.addVisitorToQueue(leo);
        thunderStorm2.addVisitorToQueue(nehemia);
        thunderStorm2.addVisitorToQueue(jason);
        thunderStorm2.addVisitorToQueue(sharon);
        thunderStorm2.addVisitorToQueue(benny);
        thunderStorm2.addVisitorToQueue(visitor7);
        thunderStorm2.addVisitorToQueue(visitor8);
        thunderStorm2.addVisitorToQueue(visitor9);
        thunderStorm2.addVisitorToQueue(visitor10);
        thunderStorm2.addVisitorToQueue(visitor11);
        thunderStorm2.addVisitorToQueue(visitor12);
        System.out.println("add visitors to Queue finish.");

        System.out.println();
        thunderStorm2.runOneCycle();

        System.out.println();
        thunderStorm2.printQueue();

        System.out.println();
        thunderStorm2.printRideHistory();

        
    }

    public void partSix() {
        Employee operator = new Employee("Jacket", 48, "male", "005", "Ride Operator");

        Ride rollerCoaster2 = new Ride(operator, true,"Roller Coaster", 3);
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
        System.out.println("add visitors to ride history finish.");

        System.out.println(); //for split
        rollerCoaster2.printRideHistory(); //check

        System.out.println();
        //file name, e.g. ride_history_Roller Coaster.txt
        rollerCoaster2.exportRideHistory("ride_history_"+rollerCoaster2.getRideName()+".txt");

    }

    public void partSeven() {
        Employee operator = new Employee("test", 48, "male", "005", "Ride Operator");
        Ride testRide = new Ride(operator, true,"Roller Coaster", 3);
        
        testRide.importRideHistory("ride_history_Roller Coaster.txt");

        testRide.printRideHistory();
    }

}