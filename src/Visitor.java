public class Visitor extends Person {
    //TravelGroup,
    //e.g. independent travel, China International Travel Service(CITS), Wing On Travel(WOT),Miramar Travel(MT)
    private String travelGroup; //旅行团
    private String ticketType;

    public Visitor() {
        super(); // 调用父类默认构造器
        this.travelGroup  = "CITS";
        this.ticketType = "Standard";
    }

    public Visitor(String name, String sex, int age, String travelGroup , String ticketType) {
        super(name, sex, age); // 调用父类带参数构造器
        this.travelGroup  = travelGroup ;
        this.ticketType = ticketType;
    }

    public String gettravelGroup () {
        return travelGroup ;
    }

    public void settravelGroup (String travelGroup ) {
        this.travelGroup  = travelGroup ;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
