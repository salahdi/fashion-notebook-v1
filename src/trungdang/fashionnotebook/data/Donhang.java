package trungdang.fashionnotebook.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Donhang {
	private String id;
	public Donhang(){
		id = "D";
		
		int n = new Random().nextInt(1000000);
		id += n + "";
	}
	public String toString(){
		String txt=id;
		return txt;
	}
	

}
