package java007_class.part02;

public class CountVarg {

	public CountVarg() {

	}

	void addValue(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	} // end addValue()

	// 고정매개변수와 가변매개변수가 같이 사용될때는
	// 언제나 고정매개변수를 먼저 사용한다.
	// 가변매개변수를 한번만 사용할 수 있다.
	void addValue(String name, int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.printf("%s %d\n", name, sum);
	}// end addValue()

} // end class
