package hw;
import java.util.Scanner;
//已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
//105021044 鐘岑哲
public class hw02_105021044 {

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