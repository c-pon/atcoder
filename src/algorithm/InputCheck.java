package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputCheck {

	public static void main(String[] args) throws java.io.IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input="";
		for(;;){
			System.out.print(">");
			input = in.readLine();
			if(input.length()==0){
				System.out.println("何も入力されてません");
			}else if(input.equals("EXIT")){
				break;
			}else{
				System.out.println(input);
			}
			
		}

	}

}
