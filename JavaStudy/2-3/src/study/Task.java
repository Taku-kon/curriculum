package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
	 	System.out.println("引数が1つの場合は" + plus( 10 ));
    	System.out.println("引数が2つの場合は" + plus( 13,17 ));
    	System.out.println("引数が3つの場合は" + plus( 20,19,21 ));
    }
}