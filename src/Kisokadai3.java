import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//新規ファイル

		while (true) {


		System.out.println("新規のファイルを作成しますか？ Yes or No");
		String q1 = null;
		String newfilemake = null;
		String q2 = null;
		String str = null;
		String q3 = null;
		String finish = null;
		try {
			BufferedReader brq1 = new BufferedReader(new InputStreamReader(System.in));
			q1 = brq1.readLine();
			if (q1.equals("Yes")) {
				//新規ファイル作成
				System.out.println("ファイル名を入力してください。");
				try {
					BufferedReader nfm = new BufferedReader(new InputStreamReader(System.in));
					newfilemake = nfm.readLine();
				}	catch (Exception e) {
						e.printStackTrace();
					}
				File newfile = new File(newfilemake + ".txt");

			    try{
			      if (newfile.createNewFile()){
			        System.out.println("ファイルの作成に成功しました");
			      }else if (newfile.exists()){
			        System.out.println("ファイルは存在しています。");
			      } else {
			    	  System.out.println("ファイルの作成に失敗しました。");
			      }

			    }catch(IOException e){
				      System.out.println(e);
				    }

			} else  if (q1.equals("No")){
				continue;
			} else {
				System.out.println("YesかNoを入力してください。");
				continue;
			}
		}	catch (Exception e) {
				e.printStackTrace();
			}


	      //上書き
		System.out.println("ファイルの上書きを行いますか？ Yes or No");
		try {
			BufferedReader brq2 = new BufferedReader(new InputStreamReader(System.in));
			q2 = brq2.readLine();
			if (q2.equals("Yes")) {
				try {
		        	BufferedWriter bw2 = new BufferedWriter(new FileWriter(newfilemake + ".txt"));
		        	System.out.println("記載する内容を入力してください。");
		        	String ver = null;
			      	try {
						BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
						ver = br2.readLine();
					}	catch (Exception e) {
							e.printStackTrace();
						}

		            bw2.write(ver);

		            bw2.close();

		        } catch ( IOException ex ) {
		             System.out.println( ex );
		        }
			} else if (q2.equals("No")) {
				break;
			} else {
				System.out.println("YesかNoを入力してください。");
				continue;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		//追記
		System.out.println("ファイルの追記を行いますか？ Yes or No");
		try {
			BufferedReader brq3 = new BufferedReader(new InputStreamReader(System.in));
			q3 = brq3.readLine();
			if (q3.equals("Yes")) {
				try {
					BufferedWriter bw2 = new BufferedWriter(new FileWriter(newfilemake + ".txt", true));

		        	System.out.println("追記する内容を入力してください。");
		        	String ver = null;
			      	try {
						BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
						ver = br2.readLine();
					}	catch (Exception e) {
							e.printStackTrace();
						}
		            bw2.write(ver);
		            bw2.close();
		        } catch ( IOException ex ) {
		             System.out.println( ex );
		        }
			} else if (q2.equals("No")) {
				break;
			} else {
				System.out.println("YesかNoを入力してください。");
				continue;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	    //終了する

	    System.out.println("終了しますか？ Yes or No");

	    try {
			BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
			finish = fin.readLine();

				if (finish.equals("Yes")) {
					System.out.println("Adios...");
					break;
				}
				else {
					continue;
				}


		}	catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
