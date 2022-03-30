import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Coordonates> givenCoordonate = new ArrayList<>();
        Coordonates c1 = new Coordonates(1,1);
        Coordonates c2 = new Coordonates(1,3);
        Coordonates c3 = new Coordonates(3,1);
        Coordonates c4 = new Coordonates(2,1);
        Coordonates c5 = new Coordonates(3,3);
        Coordonates c6 = new Coordonates(2,3);
        Coordonates c7 = new Coordonates(1,2);
        Coordonates c8 = new Coordonates(1,2);
        //System.out.println(c1.equals(new Coordonates(1,1)));
        TreeSet<Coordonates> ts = new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        ts.add(c4);
        ts.add(c5);
        ts.add(c6);
        System.out.println("Coordonates:");
        for(Coordonates c : ts){
            System.out.println(c.toString());
        }

        System.out.println("Nb of rectangles formed:");
        System.out.println(Logic.determinateRectangles(ts));
        System.out.println();
        //System.out.println(ts.contains(c5));
        //System.out.println(ts.contains(new Coordonates(3,3)));
    }
}
