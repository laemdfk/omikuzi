import java.util.Random;


public class omikuzi {
	public static void main(String arms[]) {

		Random rand = new Random();
		int i =rand.nextInt(100) + 1;
		System.out.println(i);

		if (i <= 100 && 90 < i) {
			System.out.println("大吉！");
		}

		else if (i < 80 && 60 <= i) {
			System.out.println("中吉");
		}

		else if (30 <= i && i < 60) {
			System.out.println("小吉");
		}

		else {
			System.out.println("凶");
		}

	}
}