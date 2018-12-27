package practice01;
import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String str=scanner.nextLine();
		String sum="";
		String[] array_str;
		array_str=str.split("");
		for(int i=0;i<array_str.length;i++) {
			sum+=array_str[i];
			System.out.println(sum);
		}
		
	}

}
