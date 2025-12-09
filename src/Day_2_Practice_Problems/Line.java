package Line_Comparison;

public class Line{
    Point p1, p2;
    Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    double calculateLength(){
        double len = Math.sqrt( Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y,2));
        return len;
    }

    void checkEqual(Line l1, Line l2){
        Point p1 = l1.p1;
        Point p2 = l1.p2;
        Point p3 = l2.p1;
        Point p4 = l2.p2;
        if(p1.x==p3.x && p1.y==p3.y && p2.x==p4.x && p2.y==p4.y){
            System.out.println("Both the lines are equal\n");
        }
        else{
            System.out.println("Both the lines are not equal\n");
        }
    }
}
