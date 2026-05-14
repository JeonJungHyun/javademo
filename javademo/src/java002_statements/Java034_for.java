package java002_statements;

//2개의 주사위를 던졌을때  합계가 5가 되는 경우의 수를 구하시오.
//(1,4),(2,3),(3,2),(4,1)

public class Java034_for {

	public static void main(String[] args) {
		go: // label
			for (int i = 1; i <= 3; i++) {  // 4
				for (int j = 1; j <= 5; j++) {  //3
					System.out.printf("j=%d\n", j);
					if (j == 3) {
						// break;
						//break go;
						//continue;  //for문에서 continue을 만나면 현재 수행중인 for문의 증감식으로 이동한다.
						continue go;  //for문에서 continue go을 만나면 go라벨이 설정된 for문의 증감식으로 이동한다.					
					}
				}//end j for
				
			}//end i for
	}

}
