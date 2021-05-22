/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
  public static void main(String[] args){
       /*
      * 問1
      * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
      */
      int [] math ={ 3 , 1 , 2 , 7 , 5};
      /*
      * 問2
      * 以下のfor文を完成させなさい
      */
      for(int i = 0; i < math.length; i++){
          System.out.print(math[i] + " ");
      }
      System.out.println();
      for(int i = 0; i < math.length+1; i++){
        for (int j = math.length-1; j > i; j--) {
              /*
              * 問3
              * 以下、配列の添字を入れてソートを完成させなさい
              */
              if(math[i] > math[j]){
                int box = math[i];
                math[i] = math[j];
                math[j] = box;
              }
          }
      }
      for(int i = 0; i < math.length; i++){
          System.out.print(math[i] + " ");
      }
  }
}