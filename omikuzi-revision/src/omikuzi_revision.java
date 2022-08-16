import java.util.Random;


public class omikuzi_revision {
	public static void main(String arms[]) {

		Random rand = new Random();

		int i = rand.nextInt(100) + 1;
//
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