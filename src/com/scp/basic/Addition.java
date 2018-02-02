public class Addition {
	int i;
	int j;
	static int k = 30;
	int p;

	public Addition(int i, int j, int p) {
		super();
		this.i = i;
		this.j = j;
		this.p = p;
	}

	void m1() {
		System.out.println(i + j + k);
	}

	static void m2() {
		System.out.println(k);
	}

	public static void main(String[] args) {
		System.out.println(k);
		m2();

		Addition add = new Addition(10, 20, 30);
		add.m1();
		add.m2();
		System.out.println(add.i + "  " + add.j);
		System.out.println(add.p);
	}

}
