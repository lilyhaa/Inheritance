public class Concussion extends Injury {

    private boolean memoryLoss;

    public Concussion(int painLevel, String location, String painType, boolean memoryLoss)
    {
        super("Concussion", painLevel, location, "Throbbing");
        this.memoryLoss = memoryLoss;
    }

    public boolean hasMemoryLoss()
    {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss)
    {
        this.memoryLoss = memoryLoss;
    }




}
