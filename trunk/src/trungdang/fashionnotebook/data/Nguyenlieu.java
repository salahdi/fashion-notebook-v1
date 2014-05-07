package trungdang.fashionnotebook.data;

import java.util.Date;
import java.util.Random;

public class Nguyenlieu {
	String id;

	public Nguyenlieu() {
		id = "NG";

		int n = new Random().nextInt(1000000);
		id += n + "";
	}

	public String toString() {
		String s = id;

		return s;
	}
}
