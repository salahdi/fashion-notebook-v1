package trungdang.fashionnotebook.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.data.Khach;

public class KhachArrayAdapter extends ArrayAdapter<Khach> {
	Activity context = null;
	ArrayList<Khach> myArray = null;
	int layoutId;

	public KhachArrayAdapter(Activity context, int layoutId,
			ArrayList<Khach> arr) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.myArray = arr;
		
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);

		Khach khach = myArray.get(position);
		final TextView t=(TextView)convertView.findViewById(R.id.txtthongtinkhach);
t.setText(khach.toString());
		return convertView;
	}
}