public class Point {
    public int xCoord, yCoord; //protected olursa aynı paket içinde olduğumuz için değerlere ulaşırız
    public Point(){

    }
    public Point(int x, int y){
        this.xCoord=x; //anlık olarak yarattığım bu obje ... dır.
        this.yCoord=y;
    }

    public Point(int x) {
        this.xCoord = x;
        this.yCoord=x;
    }
}
