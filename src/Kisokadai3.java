import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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



		//変数
		String file = null;
		String finish = null;
		File newdir = null;
		File newfile = null;
		String newdirmake = null;
		String check = null;
		int num;

		BufferedReader ck = new BufferedReader(new InputStreamReader(System.in), 1);


		while(true) {
			//アクションの指定
			System.out.println("希望するアクションの番号を入力してください。");
			System.out.println("1 - 新規のフォルダ作成");
			System.out.println("2 - 新規のファイル作成");
			System.out.println("3 - ファイルの上書き");
			System.out.println("4 - ファイルの追記");
			System.out.println("5 - ファイルの読み込み");
			System.out.println("6 - ファイルの削除");
			System.out.println("1000 - 終了");


			try {

				check = ck.readLine();
				num = Integer.parseInt(check);

				if (num == 1) {
					//フォルダの作成
					try {
						System.out.println("フォルダ名を入力してください");
						BufferedReader brq4 = new BufferedReader(new InputStreamReader(System.in));
						newdirmake = brq4.readLine();
						newdir = new File("C:\\Users\\internous\\Desktop\\"+newdirmake);
						newdir.mkdir();


					} catch (Exception e) {
						System.out.println("エラーです");
					}

				} else if (num == 2) {
					String newfilemake = null;
//					BufferedReader brq1 = new BufferedReader(new InputStreamReader(System.in));
//					q1 = brq1.readLine();

						//新規ファイル作成
						System.out.println("ファイル名を入力してください。");
						try {
							BufferedReader nfm = new BufferedReader(new InputStreamReader(System.in));
							newfilemake = nfm.readLine();
						}	catch (Exception e) {
								e.printStackTrace();
							}

						 newfile = new File("C:\\Users\\internous\\Desktop\\"+newfilemake + ".txt");


					    try{
					      if (newfile.createNewFile()){
					        System.out.println("ファイルの作成に成功しました");
					      }else if (newfile.exists()){
					        System.out.println("ファイルは存在しています。");
					        continue;
					      } else {
					    	  System.out.println("ファイルの作成に失敗しました。");
					      }

					    }catch(IOException e){
						      System.out.println(e);
						    }

				} else if (num == 3) {
					 //上書き
					try {
						//ファイルの選択
						System.out.println("ファイル名を選択してください。");
						file = ck.readLine();
						File filecheck = new File("C:\\Users\\internous\\Desktop\\" + file + ".txt");
						if(!filecheck.exists()) {
							System.out.println("存在しないファイルです。");
							continue;
						} else {
							//書き込み内容
							try {
					        	BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\Users\\internous\\Desktop\\" + file + ".txt"));
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
						}
					} catch (Exception e) {
						System.out.println("存在しないファイルが指定されました。");
						continue;
					}
				} else if (num == 4) {
					//追記
					//ファイルの選択
					System.out.println("ファイル名を選択してください。");
					try {
						file = ck.readLine();
						File filecheck = new File("C:\\Users\\internous\\Desktop\\" + file + ".txt");
						if(!filecheck.exists()) {
							System.out.println("存在しないファイルです。");
							continue;
						} else {
							//書き込み内容
							try {
//								BufferedReader brq3 = new BufferedReader(new InputStreamReader(System.in));
//								q3 = brq3.readLine();
									try {
										BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\Users\\internous\\Desktop\\" + file + ".txt", true));

							        	System.out.println("追記する内容を入力してください。");
							        	String ver = null;
								      	try {
											BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
											ver = br2.readLine();
										}	catch (Exception e) {
												e.printStackTrace();
											}
								      	bw2.write("\r\n");
							            bw2.write(ver);
							            bw2.close();
							        } catch ( IOException ex ) {
							             System.out.println("存在しないファイルが指定されました。");
							             continue;
							        }

							} catch (Exception e) {
								// TODO: handle exception
							}
						}

					} catch (Exception e) {
						System.out.println("エラー");
			             continue;
					}

				} else if (num == 5) {
//					String newfilemake = null;
					//ファイルの読み込み
					System.out.println("ファイル名を選択してください。");
					try {
						file = ck.readLine();
						File filecheck = new File("C:\\Users\\internous\\Desktop\\" + file + ".txt");
						if(!filecheck.exists()) {
							System.out.println("存在しないファイルです。");
							continue;
						} else {
							try {
								String str2 = "C:\\Users\\internous\\Desktop\\"+ file + ".txt";
					            FileReader fr = new FileReader(str2);
					            BufferedReader br = new BufferedReader(fr);
					            String line;
					            int count = 0;
					            while ((line = br.readLine()) != null) {
					                System.out.println(++count + "行目：" + line);
					            }

					            //終了処理
					            br.close();
					            fr.close();

					        } catch (IOException ex) {
					            ex.printStackTrace();
					        }
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				} else if (num == 6) {
					//ファイルの削除
					System.out.println("ファイル名を指定してください。");
					try {
						file = ck.readLine();
						File filecheck = new File("C:\\Users\\internous\\Desktop\\" + file + ".txt");
						if(!filecheck.exists()) {
							System.out.println("存在しないファイルです。");
							continue;
						} else {
							filecheck.delete();
						}
					} catch (Exception e) {
						// TODO: handle exception
					}

				} else if ( num == 1000) {
					System.out.println("Bye...");
					break;
				}
				else {
					System.out.println("適切な数字を入力してください。");
					continue;
				}
			}	catch (Exception e) {
					System.out.println("適切な数字を入力してください。");
					continue;
				}

			//終了する
		    System.out.println("終了しますか？");
		    System.out.println("続ける c | 終了する f");

		    try {
				BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
				finish = fin.readLine();

					if (finish.equals("f")) {
						System.out.println("Bye...");
						break;
					}
					else if (finish.equals("c")){
						continue;
					}
			}	catch (Exception e) {
				System.out.println("適切な数字を入力してください。");
				continue;
				}

		}

	}

}
