import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelloWorld {
    public static void main(String[] args) throws IOException{
    	System.out.println("何か書いてください");
		//文字列をファイルへの書き込み
		try {
			//ファイルの新規作成＆上書き
			File fl = new File("oraora.txt");
			FileWriter fw = new FileWriter(fl);

			String str = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();

			fw.write(str + "\n");
			fw.close();

			//追記

			System.out.println("追記はありますか？");



			String filename = "oraora.txt";
			FileWriter fw2 = new FileWriter (filename);

			String ver = null;
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			ver = br2.readLine();

			fw2.write(ver);
			fw2.close();

			 /*
			  System.out.println("ファイルの上書きを行いますか？ Yes or No");
			  String q2 = null;

			  try {
				  BufferedReader brq2 = new BufferedReader(new InputStreamReader(System.in));
					q2 = brq2.readLine();
					if (q2.equals("Yes")) {
						String uwagaki = null;
						System.out.println("上書きするファイルを入力してください。");
						try {
							pw = new PrintWriter(new BufferedWriter(new FileWriter(newfilemake + ".txt")));
							uwagaki = ugk.readLine();
						}	catch (Exception e) {
								e.printStackTrace();
							}
					} else  {

					}
			} catch (Exception e) {
				// TODO: handle exception
			}
	-------------------------------------------

		      try {
					BufferedReader brq2 = new BufferedReader(new InputStreamReader(System.in));
					q2 = brq2.readLine();
					if (q2.equals("Yes")) {
						//上書き
						String uwagaki = null;
						System.out.println("入力内容を記入してください。");
						try {
							pw = new PrintWriter(new BufferedWriter(new FileWriter(newfilemake + ".txt")));
							uwagaki = ugk.readLine();
						}	catch (Exception e) {
								e.printStackTrace();
							}
						//File newfile = new File(uwagaki + ".txt");

						 uwagaki.println(ugk);
					        System.out.println("書き込みが完了しました。");

					     uwagaki.close();

					} else {
						continue;
					}
				}	catch (Exception e) {
						e.printStackTrace();
					}

		     ---------------------------------
		     try {

		            pw = new PrintWriter(new BufferedWriter(new FileWriter(newfilemake + ".txt")));
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		      	System.out.println("入力内容を記入してください。");
		      	String str = null;
		      	try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					str = br.readLine();
				}	catch (Exception e) {
						e.printStackTrace();
					}

		        pw.println(str);
		        System.out.println("書き込みが完了しました。");

		        pw.close();

		        //追記
		        try {

		        	BufferedWriter bw2 = new BufferedWriter(new FileWriter("test.txt", true));

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
		        */



		    //ファイルの読み込み

		    /*
		    String fileread = null;
		    System.out.println("読み込むファイル名を入力してください。");
		    try {
		    	BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
				fileread = br3.readLine();
			} catch (Exception e) {
				// TODO: handle exception
			}

		    FileReader fr = new FileReader(fileread + ".txt");
		    fr.read();
		    fr.close();
			*/




			/*
			//追記
				try {
				String filename = "oraora.txt";
				FileWriter fw2 = new FileWriter (filename);

				String ver = null;
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				ver = br2.readLine();

				fw2.write(ver);
				fw2.close();

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("エラー");
			} */

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + "エラーです。");
		  }
    }
}