public class TimeCalc {
    public static void main(String[] args) {
    String timestr = args [0];
    int minutesToAdd = Integer.parseInt(args[1]);

    int starthour = (timestr.charAt(0) - '0') * 10 + (timestr.charAt(1) - '0');
    int startminutes = (timestr.charAt(3) - '0') * 10 + (timestr.charAt(4) - '0');
    
    int totalmin = (starthour * 60) + startminutes;
    int totalminutes= totalmin + minutesToAdd;

    int newhours = totalminutes / 60;
    int finalmin = totalminutes % 60;
    int finalhour = newhours % 24;

    if (finalhour < 10) {
    System.out.print("0");    
    } 
    System.out.print(finalhour);
    System.out.print(":");
    if (finalmin < 0) {
    System.out.print("0");    
    }
    System.out.println(finalmin);
    }
}
