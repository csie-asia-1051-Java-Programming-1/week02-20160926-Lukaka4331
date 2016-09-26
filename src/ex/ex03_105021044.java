package ex;
import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021044 鐘岑哲
 */

public class ex03_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("使用時間=");
		float t=scn.nextFloat();
		int a=(int)(t/0.5);
		if(a<=4){
			int d=30*a;System.out.println(d);
		}else{
			if(a<=8){
			int d=40*(a-4)+30*4;System.out.println(d);
		}else{
			if(a>8){
			int d=30*4+40*2+60*(a-6);System.out.println(d);}
		}
		
	
		
		
		
		
		
	}

	}
}
