public class meProg{

public static void main(String[] args){
 hello("world");
}

public static void hello(String somebody){
  System.out.println("Hello, my wonderful " + somebody);

  double a = 5;
  double b = 2;

  Square square = new Square(5);
  System.out.println("Площадь квадрата = " + square.area());

  Rectangle rectangle = new Rectangle(2,4);
  System.out.println("Площадь прямоугольника = " + rectangle.area());
}

}