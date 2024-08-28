public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }
    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]");
    }
    @Override
    public String toString(){ return this.description; }
    public String getDescription(){ return this.description; }
    public char getTaskType(){ return this.getClass().toString().charAt(6); }
    public String listedString(){ return this.classFirstChar() + this.getStatusIcon() + " " + this; }
    public String classFirstChar() {return "[" + this.getTaskType() + "]";}
    public boolean isDone() {return this.isDone;}
    public void setUndone(){ this.isDone = false;}
    public void setDone(){ this.isDone = true;}
}