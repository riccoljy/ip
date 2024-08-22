public class Deadline extends Task{
    protected String endDate;

    public Deadline(String description, String endDate){
        super(description);
        this.endDate = endDate;
    }
    @Override
    public String listedString(){
        return super.toString() + " [by " + this.endDate + "]";
    }
}