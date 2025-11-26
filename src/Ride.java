import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ride implements RideInterface {
    private Employee operator;
    private boolean rideStatus;
    private String rideName;
    private int maxRider;
    private int numOfCycle = 0;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.operator = new Employee(); // default Employee object
        this.rideStatus = false;
        this.rideName = "";
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1; // at least 1 visitor
        this.numOfCycle = 0;
    }

    public Ride(Employee operator, boolean rideStatus, String rideName, int maxRider) {
        this.rideStatus = rideStatus;
        this.operator = operator;
        this.rideName = rideName;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycle = 0; // default 0
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

    public int getmaxRider() {
        return maxRider;
    }

    public void setmaxRider(int maxRider) {
        this.maxRider = maxRider;
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
        System.out.println(" The number of Visitors in the " + rideName + " ride history: " + num);
        return num;
    }

    @Override
    public void printRideHistory() {
        System.out.println("=== " + rideName + " ride history ===");
        System.out.println("Total visitor: " + rideHistory.size());

        if (rideHistory.isEmpty()) {
            System.out.println("ERR:" + rideName + " ride history is empty");
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

    public void sortRideHistory(Comparator<Visitor> comparator) {
        if (rideHistory.isEmpty()) {
            System.out.println("ERR: Ride history is null.");
            return;
        }

        System.out.println("Sorting ride history: " + rideName);
        VisitorComparator visitorComparator = new VisitorComparator();
        Collections.sort(rideHistory, visitorComparator);
    }

    @Override
    public void runOneCycle() {
        // ride status is false or no operator
        if (!rideStatus || rideName == null) {
            System.out.println("ERR: The ride cannot be run.");
        }
        if (waitingLine.isEmpty()) {
            System.out.println("ERR: Waiting Line is empty. Cannot run ride cycle");
            return;
        }

        // if waiting line < maxRider, all visitor can put in history
        int rideCycle = Math.min(maxRider, waitingLine.size());
        for (int i = 0; i < rideCycle; i++) {
            Visitor visitor = waitingLine.poll(); // remove from queue
            if (visitor != null) {
                rideHistory.add(visitor); // add to history
                System.out.println("Visitor " + visitor.getName() + " has taken the ride.");
            }
        }

        numOfCycle++;
        System.out.println("Ride cycle completed. Total cycles: " + numOfCycle);

    }

    public void exportRideHistory(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {

            // first line for title
            String title = "VisitorName, Age, Sex, TicketType, TravelGroup\n";
            writer.write(title);

            // one visitor one line
            for (Visitor visitor : rideHistory) {
                // five attribute
                String line = visitor.getName() + ","
                        + visitor.getAge() + ","
                        + visitor.getSex() + ","
                        + visitor.getTicketType() + ","
                        + visitor.gettravelGroup()
                        + "\n";
                writer.write(line);
            }
            System.out.println("Ride history exported to " + filename);
        } catch (IOException e) {
            System.err.println("ERR: exporting ride history: " + e.getMessage());
        }
    }

    public void importRideHistory(String filename) {
        // use buffered reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int importedCount = 0;

            while ((line = reader.readLine()) != null) {
                // Skip the blank lines. Otherwise, an empty object is imported
                if (line.trim().isEmpty())
                    continue;

                // Parse each row of data
                String[] parts = line.split(",");
                // skip title line
                if ("VisitorName".equals(parts[0].trim()))
                    continue;
                try {
                    if (parts.length == 5) { // five attribute
                        // trim Space
                        String name = parts[0].trim();
                        int age = Integer.parseInt(parts[1].trim());
                        String sex = parts[2].trim();
                        String ticketType = parts[3].trim();
                        String travelGroup = parts[4].trim();

                        // create Visitor object
                        Visitor visitor = new Visitor(name, sex, age, travelGroup, ticketType);
                        rideHistory.add(visitor);
                        importedCount++;
                    } else {
                        System.err.println("ERR: Invalid format in line: " + line);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("ERR: parsing age in line: " + line);
                }
            }

            System.out.println("Successfully imported " + importedCount + " visitors from " + filename);

        } catch (IOException e) {
            System.err.println("ERR: importing ride history: " + e.getMessage());
        }
    }

}
