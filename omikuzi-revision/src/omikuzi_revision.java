import java.util.Random;


public class omikuzi_revision {
	public static void main(String arms[]) {

		Random rand = new Random();

/*		下記コードで、for内部の変数numberに渡す数を作成する
        int nで定義したRandomメソッドと数字を同じにしておく
        (処理の差異か、一回しかforが回らなくなる)
 */
		int i = rand.nextInt(100) + 1;
//

//		変数numberを設定、for文でnumberとiが一定になるまで繰り返し
		for(int number = 0 ; number < i ; number++) {
//			新しくfor内で変数nを作成、Randomメソッドで数字を出力。
			int n = rand.nextInt(100) + 1;
			System.out.println(n);

//			下記、条件分岐の数字出力ができなくなるので、ここのSystem.out~は残す

			if (n <= 100 && 90 < n) {
				System.out.println("大吉！");
			}

			else if (n < 80 && 60 <= n) {
				System.out.println("中吉");
			}

			else if (30 <= n && n < 60) {
				System.out.println("小吉");
			}

			else {
				System.out.println("凶");
			}

		  }

	}
}

/* for 以下のifの代入イメージ
 * for(int number = 0 ; number < i ; number++) {　　
 * → 変数iから受け取った数字分、forを回すよ。
 *
 *int n = rand.nextInt(100) + 1;
  → 新しく変数nを定義したよ。Randomメソッドで1~100までの数字をランダムに出力するよ。

	System.out.println(n);
　　→ 出力されたnを、for文の中に設定した分だけ出力するよ。
　　　ただし、以下の条件分岐に従って、更にそこに設定されたSystem.out.printlnの記述を追加するよ。
 *
 * */
