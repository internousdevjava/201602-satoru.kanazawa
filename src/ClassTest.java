/**
 *
 */

/**
 * @author internous
 *
 */
class ClassTest{
  public static void main(String[] args){
    //Employeeクラスのインスタンスを生成し、参照先を変数に格納
    Employee yamamoto = new Employee("山本　太郎",2,20);
    Employee matsuda = new Employee("松田　次郎",4,25); //2つ目のインスタンス

//    //変数yamamotoが参照しているインスタンスの各フィールドに値を格納
//    yamamoto.name = "山本　太郎";
//    yamamoto.year = 2;
//    yamamoto.age = 20;
//
//    //変数matsudaが参照しているインスタンスの各フィールドに値を格納
//    matsuda.name = "松田　次郎";
//    matsuda.year = 4;
//    matsuda.age = 25;

    //変数yamamotoが参照しているインスタンスの各フィールドの値を
    //画面に表示
//    System.out.println("従業員名：" + yamamoto.name);
//    System.out.println("入社年数：" + yamamoto.year);
//    System.out.println("年　　齢：" + yamamoto.age);
      yamamoto.display();

    //変数matsudaが参照しているインスタンスの各フィールドの値を
    //画面に表示
//    System.out.println("従業員名：" + matsuda.name);
//    System.out.println("入社年数：" + matsuda.year);
//    System.out.println("年　　齢：" + matsuda.age);
      matsuda.display();
  }
}