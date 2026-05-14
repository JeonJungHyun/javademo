package java002_statements;

/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */
public class Java031_for {

	public static void main(String[] args) {
		
		// i++, i = i+1; i+= 1
		for(int i = 1; i <=10; i++) {
			if(i%3 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
