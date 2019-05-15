package ex2;

public class Cup extends Container {
    private Integer ounces = 8;
    private Integer currentVolume;
    private Integer height;

    public Cup(Integer height, Integer currentVolume)
    {
        this.currentVolume = currentVolume;
        this.height = height;
    }

    public String toString(){
        return ("This cup is holding " + currentVolume);
    }
}
