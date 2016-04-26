/**
 *
 */

/**
 * @author
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long i = 2;
		while (i < 10000) {
		  long j = 2;
		  boolean isPrime = true;
		  while (j < i) {
		    if (i % j == 0) {
		      isPrime = false;
		      break;
		    }
		    j = j + 1;
		  }
		  if (isPrime) {
		    System.out.println(i);
		  }
		  i++;
		}
	}

}
