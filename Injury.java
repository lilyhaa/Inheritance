public class Injury {

    private String name;
    private int painLevel;
    private String location;

    private String painType;

    public Injury(String name, int painLevel, String location, String painType)
    {
        this.name = name;
        this.painLevel = painLevel;
        this.location = location;
        this.painType = painType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPainLevel()
    {
        return painLevel;
    }

    public void setPainLevel(int painLevel)
    {
        this.painLevel = painLevel;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getPainType()
    {
        return painType;
    }


    public void setPainType(String painType)
    {
        this.painType = painType;
    }
    public String toString()
    {
        return "Injury Report: " +  name + " at " + location + " with " + painType + " and " + painLevel + "/10 pain.";
    }
}
