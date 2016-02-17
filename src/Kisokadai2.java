import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int answer;
		System.out.println("数当てゲームです。１～１００までの数字を入力してください。");

		answer = new java.util.Random().nextInt(100);
		//System.out.println(answer);

		String str = null;

		try {
			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				int input = Integer.parseInt(str);
				if ( answer > input ) {
					System.out.println("もっと大きな数字です。");
					continue;
				} else if ( input > answer ) {
					System.out.println("もっと小さな数字です。");
					continue;
				  } else {
					System.out.println("正解です！");
					break;
				  	}
			}
		}		catch (Exception e) {
				e.printStackTrace();
				}
	}
}
