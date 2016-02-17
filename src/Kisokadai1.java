import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力");
		String str = null;

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
			}	catch (Exception e) {
					e.printStackTrace();
				}

		int x = Integer.parseInt(str);

		System.out.println("数値を入力");
		String ver = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ver = br.readLine();
		}	catch (Exception e) {
				e.printStackTrace();
			}

		int y = Integer.parseInt(ver);

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print(j * i + " ");
			}
				System.out.println();
		}

	}

}
