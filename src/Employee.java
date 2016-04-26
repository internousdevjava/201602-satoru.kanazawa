/**
 *
 */

/**
 * @author internous
 *
 */
	class Employee {

		    //フィールド
		    String name;      //社員名
		    int    year;      //入社年数
		    int    age;       //年齢

		    //コンストラクタの定義
		    Employee(String name,int year,int age){
		      this.name = name;
		      this.year = year;
		      this.age = age;
		    }

		    //各フィールドの値を表示するメソッド
		    void display(){
		      System.out.println("従業員名："+ name);
		      System.out.println("入社年数："+ year);
		      System.out.println("年　　齢："+ age);
		    }

}
