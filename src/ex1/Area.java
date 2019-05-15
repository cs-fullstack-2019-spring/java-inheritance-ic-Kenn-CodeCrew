package ex1;

public class Area extends City {
    private String area = "Midtown";
    private String buildingName;

    public Area(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public String getArea()
    {
        return area;
    }

    public String getBuildingName()
    {
        return buildingName;
    }
}
