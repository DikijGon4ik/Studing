public class meProg{

public static void main(String[] args){
 hello("world");
}

public static void hello(String somebody){
  System.out.println("Hello, my wonderful " + somebody);

  double a = 5;
  double b = 2;

  Square s = new Square(5);
  System.out.println("Площадь квадрата = " + area(s));

  Rectangle r = new Rectangle(2,4);
  System.out.println("Площадь прямоугольника = " + area(r));

}

public static double area(Square s){
  return s.a;
}

public static double area(Rectangle r){
  return r.a*r.b;
}
}