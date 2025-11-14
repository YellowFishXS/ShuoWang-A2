public interface RideInterface {

    //add a visitor to the queue.
    void addVisitorToQueue(Visitor visitor);

    //remove a visitor from thequeue
    void removeVisitorFromQueue();

    //print the list of waiting visitors
    void printQueue();
    
    // add a visitor to the ride history
    void addVisitorToHistory(Visitor visitor);
    
    //check whether the visitor is in the ride history
    boolean checkVisitorFromHistory(Visitor visitor);

    // return the number of Visitors in the ride history
    int numberOfVisitors();

    //print the list of visitors who took the rides
    void printRideHistory();
    
    //run the ride for one cycle
    void runOneCycle();
}
