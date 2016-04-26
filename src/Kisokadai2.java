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
		int count = 0;
		String finish = null;
	while (true) {

		System.out.println("数当てゲームです。１～１００の数字を入力してください。");
		System.out.println("終了は１０００を入力してください。");
		answer = new java.util.Random().nextInt(101);
		//System.out.println(answer);

		String str = null;
		int input;

			while (true) {
				count++;
				try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				input = Integer.parseInt(str);
				}
				catch (Exception e) {
					System.out.println("数字を入力してください。");
					continue;
				}
				  if ( input == 1000 ){
					  System.out.println("終了します。");
					  break;
				  } else if (input < 1 || input > 100){
					  System.out.println("１～１００の数字を入力してください。");
					  continue;
				  }
				  else if ( answer > input ) {
					System.out.println("もっと大きな数字です。");
					continue;
				} else if ( input > answer ) {
					System.out.println("もっと小さな数字です。");
					continue;
				  }  else {
					  	if (count == 1) {
					  		System.out.println("すごい！！一発で正解です！");
					  		break;
					  	} else {
					  		System.out.println("正解です！" + count + "回目で正解しました。");
							break;
					  	}

				  	}

				}
			System.out.println("終了しますか？");
			System.out.println("続けるときは5を入力してください。");
			System.out.println("それ以外のキー入力で終了します。");



			try {
				BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
				finish = fin.readLine();

					if (finish.equals("5")) {
						count = 0;
						continue;
					} else  {
						System.out.println("Bye...");
						break;
					}


			}	catch (Exception e) {
					break;
				}


		}



	}
}
