package string;
import java.util.Scanner;
class StrRev{
  void reverse(String in){
    char [] A= in.toCharArray();
    int f=0;
    for (int i=0;i<A.length;i++){
      if (A[i]==' ' || i==A.length-1){
        printout(A,f,i);
        if (i<A.length-1) f=i+1;
      }
    }
  }
  void printout(char [] A, int f,int i){
    if (i==A.length-1) System.out.print(A[i]);
    for (int a=i-1;a>=f;a--) System.out.print(A[a]);
    System.out.print(" ");
  }
}