public class meProg{

public static void main(String[] args){
 hello("world");
}
 public static void hello(String somebody){
   System.out.println("Hello, my wonderful " + somebody);

   double l = 5;
   System.out.println("Площадь квадрата = " + area(l));

   double a = 4;
   double b = 6;
   System.out.println("Площадь прямоугольника = " + area(a,b));
 }

 public static double area(double l){
   return l*l;
 }

 public static double area(double a, double b){
   return a*b;
 }
}