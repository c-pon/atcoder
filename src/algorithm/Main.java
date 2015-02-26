package algorithm;


import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		int n,tmp;
		String str[];
		Scanner scan = new Scanner(System.in);
		n=Integer.parseInt(scan.next());
		int[] S = new int[n];
		int[] E = new int[n];
		for(int i=0;i<n;i++){
			str=scan.next().split("-",0);
			tmp = Integer.parseInt(str[0]);
			if((tmp%10) < 5){
				tmp -= (tmp%10);
				S[i] = tmp;
			}else{
				tmp = tmp - (tmp%10) +5;
				S[i] = tmp;
			}
			tmp = Integer.parseInt(str[1]);
			if((tmp%10)==0)
				E[i]=tmp;
			else if(0< (tmp%10)&&(tmp%10) < 6){
				tmp = tmp - (tmp%10)+5;
				E[i] = tmp;
			}else{
				tmp = tmp - (tmp%10) + 10 ;
				if((tmp%100)>=60)
					tmp = tmp +40;
				E[i] = tmp;
			}
		}
		Data data[]=new Data[n];
		for(int i=0;i<n;i++){
			data[i]=new Main.Data(S[i],E[i]);
		}
		
		for(int i=0;i<n;i++){
			System.out.print(S[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(E[i]+" ");
		}
		System.out.println();
		
	}
	class Data{
		int S,E;
		
		Data(int S,int E){
			this.E=E;
			this.S=S;
		}
	}
}
