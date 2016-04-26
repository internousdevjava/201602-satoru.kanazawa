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
		String str = null;
		String ver = null;

	while (true) {
				//縦の数字
				int x;
				System.out.println("縦の行の桁数を入力してください。１～１００");
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					str = br.readLine();
					x = Integer.parseInt(str);
				}	catch (Exception e) {
					System.out.println("数字を入力してください。");
					continue;
				}

		//横の行
		System.out.println("横の行の桁数を入力してください。１～１００");

		int y;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ver = br.readLine();
			y = Integer.parseInt(ver);
		}	catch (Exception e) {
			System.out.println("数字を入力してください。");
			continue;
			}

			if (x >= 1 && x <= 100 && y >= 1 && y <= 100) {
				for (int i = 1; i <= x; i++) {
					for (int j = 1; j <= y; j++) {
						System.out.print((i*j)>=10 ? " "+(i*j) : "  "+(i*j));
					}
						System.out.println();
				}
			} else {
				System.out.println("エラーです。");
				continue;
			}
			break;

	}

	}

}
