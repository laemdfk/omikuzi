package fizzuzz;

import java.util.Random;

public class FizzBuzz {
	public static void main(String arms[]) {
		Random rand = new Random();
		int i = rand.nextInt(100) + 1;
		System.out.println(i);

			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println("FizzBuzz");
			}

			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}

			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}

			else {
				System.out.println(i);
			}

		}
	}

