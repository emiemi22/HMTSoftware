public class Coordonates implements Comparable<Coordonates> {
        float x , y ;
        public Coordonates(float x, float y){
            this.x = x ;
            this.y = y ;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

    @Override
    public int compareTo(Coordonates o) {
       // System.out.println("Comparing, "+this+" to "+o);
        if(this.x==o.x){
            if (this.y < o.y){
                return -1 ;
            }
            else if (this.y == o.y)
                return 0 ;
            else return 1 ;
        }
        if (this.x < o.x){
            return  -1 ;
        }
        else return 1 ;
    }

    @Override
    public boolean equals(Object obj) {
        Coordonates elem = (Coordonates) obj;
        if (this.x == elem.getX() && this.y == elem.getY()){
            return true ;
        }
        else return false ;
    }
    @Override
    public String toString() {
        return "C{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

