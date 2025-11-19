import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor visitor1, Visitor visitor2){
        
        //sort by age, descending
        int ageComparison = Integer.compare(visitor2.getAge(), visitor1.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        
        //sort by age, ascending
        return visitor1.getName().compareTo(visitor2.getName());
    }
    
}