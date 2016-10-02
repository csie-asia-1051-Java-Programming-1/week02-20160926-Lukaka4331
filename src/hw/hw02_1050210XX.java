package hw;
import java.util.Scanner;
public class hw02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    System.out.println("a=");
    System.out.println("high=");
    int a =scn.nextInt();
    int high =scn.nextInt();
    

    if (a<=1){
    	double w1 =(double)(high-80)*0.7;    System.out.println("體重"+w1);System.out.println("男性");

    }else{if(a>=2){
    	
    	double w2 =(double)(high-70)*0.6;    System.out.println("體重"+w2);System.out.println("女性");
    }
    
    
	}

}
}