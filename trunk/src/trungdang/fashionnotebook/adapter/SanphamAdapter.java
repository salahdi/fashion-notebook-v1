package trungdang.fashionnotebook.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.data.Donhang;
import trungdang.fashionnotebook.data.Khach;
import trungdang.fashionnotebook.data.Sanpham;

public class SanphamAdapter extends ArrayAdapter<Sanpham> {
	Activity context = null;
	ArrayList<Sanpham> arrSanpham = null;
	int layoutId;

	public SanphamAdapter(Activity context, int layoutId, ArrayList<Sanpham> arr) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.arrSanpham = arr;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);

		Sanpham sanpham = arrSanpham.get(position);
		final TextView t = (TextView) convertView
				.findViewById(R.id.txtthongtinsanham);
		t.setText(sanpham.toString());
		return convertView;
	}
}