import java.io.*;
import java.util.*;
public class PrintMazepath
{
    public static void main(String []args)throws Exception{
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      printmazepath(1,1,n,m,"");
    }
    public static void printmazepath(int sr,int sc,int dr,int dc,String path){
        if(sr>dr || sc>dc){
            return;
        }
        if(sc==dc && sr==dr){
            System.out.println(path);
            return;
        }
        printmazepath(sr,sc+1,dr,dc,path+"h");
        printmazepath(sr+1,sc,dr,dc,path+"v");
    }
}
