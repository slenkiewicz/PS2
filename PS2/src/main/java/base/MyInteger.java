package base;

public class MyInteger {
	private static int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	static int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		if (iValue % 2 == 0) {
			return false;
		}
		if (iValue == 2) {
			return true;
		}
		for (int n = 3; n * n <= iValue; n += 2) {
			if (iValue % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int iValue) {
		return isEven(iValue);
	}

	public static boolean isOdd(int iValue) {
		return isOdd(iValue);
	}

	public static boolean isPrime(int iValue) {
		return isPrime(iValue);
	}

	public static boolean isEven(MyInteger iValue) {
		return MyInteger.isEven(MyInteger.getiValue());
	}

	public static boolean isOdd(MyInteger iValue) {
		return MyInteger.isOdd(MyInteger.getiValue());
	}

	public static boolean isPrime(MyInteger iValue) {
		return MyInteger.isPrime(MyInteger.getiValue());
	}

	public static boolean equals(int iValue) {
		return iValue == MyInteger.getiValue();
	}

	public static boolean equals(MyInteger iValue) {
		return MyInteger.equals(MyInteger.getiValue());
	}
}