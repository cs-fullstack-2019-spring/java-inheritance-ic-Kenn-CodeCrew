import ex1.Area;
import java.util.ArrayList;
import ex2.*;
public class Main {

    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    private static void ex1(){
        ArrayList<Area> ex1List = new ArrayList<Area>();
        ex1List.add(new Area("Crosstown"));
        ex1List.add(new Area("Midtown Crossing"));

        System.out.println(ex1List.get(0).getBuildingName());
        System.out.println(ex1List.get(0).getArea());
        System.out.println(ex1List.get(0).getCity());
        System.out.println(ex1List.get(0).getCounty());
        System.out.println(ex1List.get(0).getState());
    }

    private static void ex2(){
        ArrayList<Container> ex2Array = new ArrayList<Container>();
        ex2Array.add(new Cup(3, 5));
        ex2Array.add(new Quart(15));
        ex2Array.add(new Gallon());

        System.out.println(ex2Array.get(0));
        System.out.println(ex2Array.get(1));
        System.out.println(ex2Array.get(2));
    }
}
