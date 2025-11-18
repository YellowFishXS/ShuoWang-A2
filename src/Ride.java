import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {
    private Employee operator;
    private boolean rideStatus;
    private int rideSize;
    private String rideName;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.operator = new Employee(); // default Employee object
        this.rideStatus = false;
        this.rideSize = 0;
        this.rideName = "";
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(Employee operator, boolean rideStatus, int rideSize, String rideName) {
        this.rideStatus = rideStatus;
        this.rideSize = rideSize;
        this.operator = operator;
        this.rideName = rideName;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public boolean getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(boolean rideStatus) {
        this.rideStatus = rideStatus;
    }

    public int getRideSize() {
        return rideSize;
    }

    public void setRideSize(int rideSize) {
        this.rideSize = rideSize;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            waitingLine.add(visitor);
            System.out.println("visitor " + visitor.getName() + " joined to " + rideName + " waiting line.");
        } else {
            System.out.println("ERR: visitor object is null");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!waitingLine.isEmpty()) {
            Visitor removedVisitor = waitingLine.poll();
            System.out.println("visitor " + removedVisitor.getName() + " remove form " + rideName + " waiting line.");
        } else {
            System.out.println("ERR:waiting que is null.");
        }
    }

    @Override
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println(rideName + " waiting que is null.");
            return;
        }

        System.out.println("=== " + rideName + " Waiting Queue ===");
        int position = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(position + ". " + visitor.getName() + ", Ticktype: " + visitor.getTicketType());
            position++;
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("ERR: Visitor is null. Cannot be added to the history.");
            return;
        }

        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " is added to the " + rideName + " history");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("ERR: Visitor is null.Cannot be checked from the history.");
            return false;
        }
        boolean found = rideHistory.contains(visitor);
        System.out.println("Whether " + visitor.getName() + "in the historical record: " + (found ? "yes" : "no"));
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int num = rideHistory.size();
        System.out.println(" The number of Visitors in the" + rideName + "ride history: " + num);
        return num;
    }

    @Override
    public void printRideHistory() {
        System.out.println("=== " + rideName + " ride history ===");
        System.out.println("Total visitor: " + rideHistory.size());

        if (rideHistory.isEmpty()) {
            System.out.println(rideName + " ride history is empty");
            return;
        }

        System.out.println("Visitors List:");
        Iterator<Visitor> iterator = rideHistory.iterator();

        int num = 1;
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(num + ". " + visitor.getName() + ":");
            System.out.println("Sex: " + visitor.getSex() + ", Age:" + visitor.getAge() + ", Ticket Type:"
                    + visitor.getTicketType() + ", Travel Group: " + visitor.gettravelGroup());
            num++;
        }
    }

    @Override
    public void runOneCycle() {
        // TODO Auto-generated method stub

    }

}
