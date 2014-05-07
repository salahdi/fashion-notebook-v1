package trungdang.fashionnotebook.fragment;


import java.util.ArrayList;

import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.adapter.NguyenlieuAdapter;
import trungdang.fashionnotebook.adapter.SanphamAdapter;
import trungdang.fashionnotebook.data.Nguyenlieu;
import trungdang.fashionnotebook.data.Sanpham;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentNguyenLieu extends Fragment {
	NguyenlieuAdapter adapter = null;
	ListView lvNguyenlieu = null;
	ArrayList<Nguyenlieu> arrnguyenlieu = null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_nguyenlieu, container,
				false);
		
		lvNguyenlieu = (ListView) rootView.findViewById(R.id.lvnguyenlieu);
		arrnguyenlieu = new ArrayList<Nguyenlieu>();
		Nguyenlieu dh = new Nguyenlieu();
	
		arrnguyenlieu.add(dh);
		for (int i = 0; i < 40; i++) {
			dh = new Nguyenlieu();
			arrnguyenlieu.add(dh);

		}
		adapter = new NguyenlieuAdapter(this.getActivity(),
				R.layout.item_nguyenlieu, arrnguyenlieu);
		lvNguyenlieu.setAdapter(adapter);
		lvNguyenlieu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				Toast.makeText(getActivity(),
						"Click " + arrnguyenlieu.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				// Intent myIntent = new Intent(getActivity(),
				// KhachActivity.class);
				// startActivity(myIntent);
			}
		});
		lvNguyenlieu.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(getActivity(),
						"Click long " + arrnguyenlieu.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				return false;
			}
		});

		
		
		return rootView;
	}
	

}
