public class CalcPi {
public static void main(String [] args) { 
int n = Integer.parseInt(args[0]);
double approx = 0.0;
double currentsign = 1.0;
double currentden = 1.0;
int i = 0;
while (i < n) {
	double term = currentsign / currentden;
    approx = approx + term;
	currentsign *= -1.0;
	currentden +=2.0;
	i++;
}
double finalpi = approx * 4.0;
System.out.println("pi according to java: " + Math.PI);
System.out.println("pi, approximated:     " + finalpi);
}
}
