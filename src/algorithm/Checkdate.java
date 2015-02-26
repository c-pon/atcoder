package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Checkdate {
	public static void main(String[] args) throws java.io.IOException{
		Calendar calendar1=Calendar.getInstance();
		Calendar calendar2=Calendar.getInstance();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input="";
		int x,y;
		for(;;){
			System.out.print(">");
			input=in.readLine();
			x=Integer.parseInt(input);
			System.out.print(">");
			input=in.readLine();
			y=Integer.parseInt(input);
			calendar2.set(Calendar.MONTH,x-1);
			calendar2.set(Calendar.DATE,y);
			
			if(calendar2.compareTo(calendar1)==0){
				System.out.println("正解です");
			}else{
				System.out.println("間違いです");

			}
				
		}
	}
}