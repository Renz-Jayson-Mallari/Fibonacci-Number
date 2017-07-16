import java.util.ArrayList;
import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input :");
		int input =  in.nextInt();
		fibonacci(input);
	}
	public static void fibonacci(int in){
		int counter = 0;
		int fibNum = 0;
		ArrayList<Integer> fibList = new ArrayList<Integer>(in);
		
		while(counter < in){
			fibList.add(fibNum);
			if(fibNum < 1) {
				fibNum +=1;
			}else{
				fibNum += fibList.get(counter -1);
			}
			counter +=1;
		}
		
		System.out.println(fibList);
	}
}
