public  class  TestRandom {
public static void main(String[]  args) {
int N = Integer.parseInt(args[0]);
int countgreater = 0;
int countlesser = 0;
int i = 0;

while (i<N) {
    double value = Math.random();
if (value > 0.5) {
	countgreater++;
} else { 
    countlesser++;
}
i++;
}
System.out.println("> 0.5: " + countgreater + " times");
System.out.println("<= 0.5: " + countlesser + " times");

if (countlesser == 0) {
return;
}
double ratio = (double)countgreater/countlesser;
System.out.println("Ratio: " + ratio);
}
}
