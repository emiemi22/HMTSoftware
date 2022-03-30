import java.util.Set;
import java.util.TreeSet;

public class Logic {
    public static int determinateRectangles(TreeSet<Coordonates> set){
        int counter = 0 ;

        for(Coordonates c : set){
            // we have to find an element which has
            // different coordonates with the current coordonate
            //x1!=x2 and y1!=y2
            for(Coordonates c2 : set){
                if (c.getX() != c2.getX() && c.getY() != c2.getY()){
                    // we have found a coordonate which can be a diagonal for a possible rectangle
                    // we know two coordonates of the possible rectangle
                    // now -> check if exists the other two
                    Coordonates downCoord = new Coordonates(c2.getX(),c.getY());
                    Coordonates upCoord = new Coordonates(c.getX(),c2.getY());

                    //log n takes for set to find a coordonate.
                    if (set.contains(downCoord) && set.contains(upCoord)){
                        //now we have found 4 coords, there is a rectangle
                        counter++;
                    }
                }
            }

        }
        // because for each vertex we determine their rectangle
        // that is 4 times
        counter = counter / 4 ;

        return counter ;
    }
}
