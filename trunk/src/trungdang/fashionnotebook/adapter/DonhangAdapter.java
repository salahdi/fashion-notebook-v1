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

public class DonhangAdapter extends ArrayAdapter<Donhang> {
	Activity context = null;
	ArrayList<Donhang> arrDonhang = null;
	int layoutId;

	public DonhangAdapter(Activity context, int layoutId, ArrayList<Donhang> arr) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.arrDonhang = arr;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);

		Donhang donhang = arrDonhang.get(position);
		final TextView t = (TextView) convertView
				.findViewById(R.id.txtthongtindonhang);
		t.setText(donhang.toString());
		return convertView;
	}
}