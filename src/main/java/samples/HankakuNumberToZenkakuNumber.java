package samples;

public class HankakuNumberToZenkakuNumber {

	public static String hankakuNumberToZenkakuNumber(String s) {

		int a;
		a=0;
		if ("aaa".equals("bbb") == true){
		a =2;	
		}
		
		int x = 2;
		int y = 5;
		// 間違い: 結果は0.0となる
		double value1 =  x / y;
		
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				sb.setCharAt(i, (char) (c - '0' + '０'));
			}
		}
       System.out.println(44);
		return sb.toString();
	}
	
	public void printInput(String input) {
		if (input == null) {
			new IllegalArgumentException("input must not be null");
		}
		System.out.println("Input is " + input);
	}
}
