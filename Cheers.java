public class Cheers {
public static void main(String[] args) {
String input = args[0];
int n = Integer.parseInt(args[1]);

String cheer = input.toUpperCase();
int length = cheer.length();
String an = "AEFHILMNORSX";
            
int i = 0;
while (i < length) {
        char x = cheer.charAt(i);
if (an.indexOf(x) >= 0) {
        System.out.println("Give me an " + x + ": " + x + "!"); 
} else {
        System.out.println("Give me a  " + x + ": " + x + "!");
}
i++;
}
System.out.println("What does that spell?");
int y = 0;
while (y < n) {
        System.out.println(cheer + "!!!");
        y++;
}
}
}
