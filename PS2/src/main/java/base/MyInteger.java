package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		boolean bool = false;
		if (iValue % 2 == 0) {
			bool = true;
		}
		return bool;
	}

	public boolean isOdd() {
		boolean bool = false;
		if (iValue % 2 != 0) {
			bool = true;
		}
		return bool;
	}

	public boolean isPrime() {
		boolean bool = true;
		for (int j = 2;  j < Math.pow(this.iValue, 0.5); j++) {
			if ( (iValue % j) == ((int)0)) {
				bool = false;
			}
		}
		return bool;
	}

	public static boolean isEven(int i) {
		boolean bool = false;
		if (i % 2 == 0) {
			bool = true;
		}
		return bool;
	}

	public static boolean isOdd(int i) {
		boolean bool = false;
		if (i % 2 != 0) {
			bool = true;
		}
		return bool;
	}

	public static boolean isPrime(int i) {
		boolean bool = true;
		for (int j = 2; j < Math.pow(i, 0.5); j++) {
			if ((i % j) == (int)0) {
				bool = false;
			}
		}
		return bool;
	}

	public static boolean isEven(MyInteger i) {
		boolean bool = false;
		if (i.getiValue() % 2 == 0) {
			bool = true;
		}
		return bool;
	}

	public static boolean isOdd(MyInteger i) {
		boolean bool = false;
		if (i.getiValue() % 2 != 0) {
			bool = true;
		}
		return bool;
	}

	public static boolean isPrime(MyInteger i) {
		boolean bool = true;
		for (int j = 2; j < Math.pow(i.getiValue(), 0.5); j++) {
			if ((i.getiValue() % j) == (int)0) {
				bool = false;
			}
		}
		return bool;
	}

	public boolean isEquals(int i){
		return (this.iValue == i);
		
	}

	public boolean isEquals(MyInteger myint){
		return (myint.iValue == this.iValue);
	}





}
