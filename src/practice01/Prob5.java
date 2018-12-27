package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			String str=String.valueOf(i);
			boolean isChack=false;
			int cnt=0;
			for(int j=0;j<str.length();j++) {
				char chk=str.charAt(j);
				
				if(chk=='3' || chk=='6' || chk=='9') {
					if(cnt==0) {
					System.out.print(i);
					}
					System.out.print('짝');
					isChack=true;
					cnt++;
				}
			}
			if(isChack==true) {
				System.out.println();
			}
		}
	}
}
