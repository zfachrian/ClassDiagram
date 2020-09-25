package ClassDiagram;

// import ClassDiagram.Point;

public class Line {
    public Point firstPoint;
    public Point secondPoint;
    public Double length;

    public Line(Point t1, Point t2) {
        this.firstPoint = t1;
        this.secondPoint = t2;
    }

    public double getLength() {
        int dx = this.secondPoint.coordinatex - this.firstPoint.coordinatex;
        int dy = this.secondPoint.coordinatey - this.firstPoint.coordinatey;
        int dz = this.secondPoint.coordinatez - this.firstPoint.coordinatez;
        double length = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2));
        return length;
    }

}
