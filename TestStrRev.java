package string;
import string.StrRev;
import java.util.Scanner;
class TestStrRev{
  public static void main(String []abc){
    Scanner S= new Scanner(System.in);
    String in= S.nextLine();
    new StrRev().reverse(in);
  }
}