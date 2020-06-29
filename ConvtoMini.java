import java.util.Scanner;

public class ConvtoMini {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
String s;

System.out.printf("Introduza um nome em maiusculas para converter em minisculas: ");
s = in.nextLine();

System.out.println(s.toLowerCase());
}
}