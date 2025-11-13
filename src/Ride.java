public class Ride {
    private Employee operator; 
    private boolean rideStatus;
    private int rideSize;


    public Ride() {
        this.rideStatus = false;
        this.rideSize = 0;
        this.operator = new Employee(); // default Employee object
    }

    public Ride(boolean rideStatus, int rideSize, Employee operator) {
        this.rideStatus = rideStatus;
        this.rideSize = rideSize;
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

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
