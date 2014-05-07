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
import trungdang.fashionnotebook.data.Nguyenlieu;

public class NguyenlieuAdapter extends ArrayAdapter<Nguyenlieu> {
	Activity context = null;
	ArrayList<Nguyenlieu> arrNguyenlieu = null;
	int layoutId;

	public NguyenlieuAdapter(Activity context, int layoutId, ArrayList<Nguyenlieu> arr) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.arrNguyenlieu = arr;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);

		Nguyenlieu nguyenlieu = arrNguyenlieu.get(position);
		final TextView t = (TextView) convertView
				.findViewById(R.id.txtthongtinnguyenlieu);
		t.setText(nguyenlieu.toString());
		return convertView;
	}
}