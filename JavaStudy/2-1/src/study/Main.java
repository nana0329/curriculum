package study;

/**
 *
 * 本課題では、フィールド変数、メソッドの基本的な使い方を学んでいきましょう。 課題範囲は以下のとおりです。 Main.java: 問①から問③
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

	public static void main(String[] args) {

		// ① firstNameとlastNameという名前の変数を定義し、
		// firstNameには自分の名前、lastNameには自分の名字で初期化しなさい
		String firstName = "Shimizu";
		String lastName = "Ryo";

		// getName関数の呼び出しと出力
		System.out.println(getName(lastName, firstName));
		System.out.println();

		int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// ③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
		// 要素が奇数の場合には「nは奇数です。」と出力されます。
		for (int n = 0; n < arr.length; n++) {
			isOdd(n);

		}
	}

	// ② 関数を定義しなさい。
	// 関数名：getName
	// 修飾子：public
	// 引数には①で定義したfirstNameとlastNameを引数で受け取り、
	// last_name と first_name を連結した値を返り値とする変数を定義しなさい。
	public static String getName(String lastName, String firstName) {
		return lastName + firstName;
	}

	// 奇数の判定を行う。
	public static void isOdd(int num) {
		if (num % 2 != 0) {
			System.out.println(num + "は奇数です。");
		}
	}
}