abstract class Shape{
    int i,j;
    public abstract void area();
    public Shape(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Rectangle extends Shape{
    public Rectangle(int i,int j){
        super(i,j);
    }
    public void area(){
        System.out.println("Area of rectangle is : "+super.i*super.j);
    }
}
class Triangle extends Shape{
    int k;
    public Triangle(int i,int j,int k){
        super(i,j);
        this.k = k;
    }
    public void area() {
        int s = (super.i + super.j + k)/2;
        System.out.println("Area of triangle is : "+Math.sqrt( s*(s-super.i)*(s-super.j)*(s-k)));
    }
}
class Circle extends Shape{
    public Circle(int i){
        super(i,0);
    }
    public void area() {
        System.out.println("Area of Circle is : "+Math.PI*super.i*super.i);
    }
}
public class Areas {
    public static void main(String[] args){
        Rectangle r = new Rectangle(4,6);
        Triangle t = new Triangle(3,4,5);
        Circle c = new Circle(1);
    }
}
