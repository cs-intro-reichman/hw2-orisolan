public class Collatz {
	public static void main(String args[]) {
	int n = Integer.parseInt(args[0]);
	String mode = args [1];
	int i = 1;
	while (i <= n) {
    int current = i;
	int steps = 0;
	String sequence = "";
	boolean firsts = false;

	if (i == 1 && (mode.equals("v"))) {
		sequence = "1 4 2 1";
		steps = 3;
		firsts = true;
	}
	if (!firsts) {
	if (mode.equals("v")) {
	sequence += current;	
	}

	while (current != 1) {
	 if (current % 2 == 0)
	{
         current = current / 2;
		} else {
			current = 3 * current + 1;
		}
    steps++;

	if (mode.equals("v")) {
		sequence += " " + current;
}
}
}
	if (mode.equals("v")) {
		int totalsteps = steps + 1;
		sequence += " (" + totalsteps + ")";
        System.out.println(sequence);
	}

	i++;
}
System.out.println();
if (mode.equals("c") || mode.equals("v")) {
System.out.println("Every one of the first " + n + " hailstone sequences reached 1." );
}
}
}