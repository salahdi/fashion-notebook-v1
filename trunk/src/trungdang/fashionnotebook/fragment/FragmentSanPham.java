package trungdang.fashionnotebook.fragment;


import java.util.ArrayList;

import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.adapter.SanphamAdapter;
import trungdang.fashionnotebook.data.Sanpham;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentSanPham extends Fragment {
	SanphamAdapter adapter = null;
	ListView lvSanpham = null;
	ArrayList<Sanpham> arrSanpham = null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_sanpham, container,
				false);
		
		lvSanpham = (ListView) rootView.findViewById(R.id.lvSanpham);
		arrSanpham = new ArrayList<Sanpham>();
		Sanpham dh = new Sanpham();
	
		arrSanpham.add(dh);
		for (int i = 0; i < 40; i++) {
			dh = new Sanpham();
			arrSanpham.add(dh);

		}
		adapter = new SanphamAdapter(this.getActivity(),
				R.layout.item_sanpham, arrSanpham);
		lvSanpham.setAdapter(adapter);
		lvSanpham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				Toast.makeText(getActivity(),
						"Click " + arrSanpham.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				// Intent myIntent = new Intent(getActivity(),
				// KhachActivity.class);
				// startActivity(myIntent);
			}
		});
		lvSanpham.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(getActivity(),
						"Click long " + arrSanpham.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				return false;
			}
		});

		
		
		return rootView;
	}
	

}
