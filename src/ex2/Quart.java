package ex2;

public class Quart extends Container {
    private Integer ounces = 32;
    private Integer height = 8;
    private Integer currentVolume;

    public Quart(Integer currentVolume)
    {
        this.currentVolume = currentVolume;
    }

    public String toString(){
        return ("This quart is holding " + currentVolume);
    }
}
