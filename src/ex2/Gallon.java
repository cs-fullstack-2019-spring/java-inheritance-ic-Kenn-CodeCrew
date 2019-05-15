package ex2;

public class Gallon extends Container {
    private Integer ounces = 128;
    private Integer currentVolume = 120;
    private Integer height = 23;

    public String toString(){
        return ("This gallon is holding " + currentVolume);
    }
}
