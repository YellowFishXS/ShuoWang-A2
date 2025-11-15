import java.util.LinkedList;
import java.util.Queue;

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
        this.rideName ="";
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride( Employee operator, boolean rideStatus, int rideSize, String rideName) {
        this.rideStatus = rideStatus;
        this.rideSize = rideSize;
        this.operator = operator;
        this.rideName = rideName;
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

  


}
