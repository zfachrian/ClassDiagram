package ClassDiagram;

public class Main {
    public static void main(String[] args) {
        Point t1 = new Point(1, 1, 0);
        // t1.showPoint();

        Point t2 = new Point(5, 1, 0);
        // t2.showPoint();

        Point t3 = new Point(1, 5, 0);
        // t3.showPoint();

        Point t4 = new Point(5, 5, 0);
        // t4.showPoint();

        Point t5 = new Point(1, 1, 4);
        // t5.showPoint();

        Point t6 = new Point(5, 1, 4);
        // t6.showPoint();

        Point t7 = new Point(1, 5, 4);
        // t7.showPoint();

        Point t8 = new Point(5, 5, 4);
        // t8.showPoint();

        // LINE

        // bawah depan
        Line L1 = new Line(t1, t2);
        // atas depan
        Line L2 = new Line(t3, t4);
        // kiri depan
        Line L3 = new Line(t1, t3);
        // kanan depan
        Line L4 = new Line(t2, t4);
        // bawah belakang
        Line L5 = new Line(t5, t6);
        // atas belakang
        Line L6 = new Line(t7, t8);
        // kiri belakang
        Line L7 = new Line(t5, t7);
        // kanan belakang
        Line L8 = new Line(t6, t8);
        // kanan bawah
        Line L9 = new Line(t2, t6);
        // kanan atas
        Line L10 = new Line(t4, t8);
        // kiri atas
        Line L11 = new Line(t3, t7);
        // kiri bawah
        Line L12 = new Line(t1, t5);

        // SQUARE
        Line[] depan = { L1, L2, L3, L4 };
        Line[] belakang = { L5, L6, L7, L8 };
        Line[] atas = { L2, L10, L11, L6 };
        Line[] bawah = { L1, L11, L9, L5 };
        Line[] kanan = { L8, L10, L9, L4 };
        Line[] kiri = { L3, L7, L11, L12 };

        Square square1 = new Square(depan);
        Square square2 = new Square(belakang);
        Square square3 = new Square(atas);
        Square square4 = new Square(bawah);
        Square square5 = new Square(kanan);
        Square square6 = new Square(kiri);

        System.out.println("luas =" + square1.getArea());
        System.out.println("luas =" + square2.getArea());
        System.out.println("luas =" + square3.getArea());
        System.out.println("luas =" + square4.getArea());
        System.out.println("luas =" + square5.getArea());
        System.out.println("luas =" + square6.getArea());

        // SQUARE
        Square[] cube = { square1, square2, square3, square4, square5, square6 };
        Cube cube1 = new Cube(cube);

        System.out.println("volume =" + cube1.getVolume());
    }
}
