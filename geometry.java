public class Geometry {

	public static double twopi = 6.28;

	public static void main(String[] args){
		double c = solveHypotenuse(3, 4); //calling our method
		System.out.println(c); //prints 5.0
	}

public static double solveHypotenuse(double a, double b) {
		double a2 = a * a;
		double b2 = b * b;
		return Math.sqrt(a2 + b2);
}

public static boolean isRightTriangle(double a, double b, double c) {
	return (c == solveHypotenuse(a, b));
}


public static double getDistance(double x1, double y1, double x2, double y2) {
	double deltaX = x2 β x1;
	double deltaY = y2 β y1;
	return solveHypotenuse(deltaX, deltaY);
}

public static double getDistance(double x, double y) {
	return solveHypotenuse(x, y);
}

public static void printHypotenuse(double a, double b) {
  System.out.print(βThe hypotenuse has a length of: β);
  System.out.println(solveHypotenuse(a, b));
}
  
}
