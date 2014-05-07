package trungdang.fashionnotebook.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Khach {

	private String ten = "Ten";
	private Date ngaysinh = new Date();
	private String diachi = "dia chi";
	private String sothich ="chiso thich thoi tran";
	private String sdt = "0963305729";

	private String gioitinh = "-----";
	private String id = "K1401001";

	public Khach() {
		id = "K";
		String f = "yyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(f, Locale.US);
		id += sdf.format(new Date());
		int n = new Random().nextInt(100);
		id += n + "";

	}

	/**
	 * @return the ngaysinh
	 */
	public Date getNgaysinh() {
		return ngaysinh;
	}

	/**
	 * @param ngaysinh
	 *            the ngaysinh to set
	 */
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}

	/**
	 * @param ten
	 *            the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}

	/**
	 * @return the diachi
	 */
	public String getDiachi() {
		return diachi;
	}

	/**
	 * @param diachi
	 *            the diachi to set
	 */
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	/**
	 * @return the sothich
	 */
	public String getSothich() {
		return sothich;
	}

	/**
	 * @param sothich
	 *            the sothich to set
	 */
	public void setSothich(String sothich) {
		this.sothich = sothich;
	}

	/**
	 * @return the sdt
	 */
	public String getSdt() {
		return sdt;
	}

	/**
	 * @param sdt
	 *            the sdt to set
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	/**
	 * @return the gioitinh
	 */
	public String getGioitinh() {
		return gioitinh;
	}

	/**
	 * @param gioitinh
	 *            the gioitinh to set
	 */
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		String txt = ten;
		txt += " - " + sdt;
		txt += " - " + diachi;
		txt += " - " + gioitinh;

		txt += " - " + DateFormat.getDateInstance().format(ngaysinh);
		txt += " - " + id;

		return txt;
	}
}
