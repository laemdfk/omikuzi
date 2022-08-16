import java.util.Random;


public class omikuzi_revision_maximum {
	public static void main(String arms[]) {

		Random rand = new Random();

		int i = rand.nextInt(1000) + 1;
//
		for(int number = 0 ; number < i ; number++) {
//			新しくfor内で変数nを作成、Randomメソッドで数字を出力。
			int n = rand.nextInt(1000) + 1;
			System.out.println(n);

//			下記、条件分岐の数字出力ができなくなるので、ここのSystem.out~は残す

			if (n <= 1000 && 900 < n) {
				System.out.println("大吉！");
			}

			else if (n < 700 && 800 <= n) {
				System.out.println("中吉");
			}

			else if (150 <= n && n < 700) {
				System.out.println("小吉");
			}

			else {
				System.out.println("凶");
			}

		  }

	}
}