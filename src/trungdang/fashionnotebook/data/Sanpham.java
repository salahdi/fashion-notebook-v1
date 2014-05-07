package trungdang.fashionnotebook.data;

import java.util.Date;
import java.util.Random;

public class Sanpham {
	String id;

	public Sanpham() {
		id = "S";

		int n = new Random().nextInt(1000000);
		id += n + "";
	}

	public String toString() {
		String s = id;

		return s;
	}
}
