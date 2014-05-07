package trungdang.fashionnotebook.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.R.id;
import trungdang.fashionnotebook.R.layout;
import trungdang.fashionnotebook.adapter.DonhangAdapter;
import trungdang.fashionnotebook.data.Donhang;

public class FragmentDonHang extends Fragment {
	DonhangAdapter adapter = null;
	ListView lvdonhang = null;
	ArrayList<Donhang> arrdonhang = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_donhang, container,
				false);
		lvdonhang = (ListView) rootView.findViewById(R.id.lvdonhang);
		arrdonhang = new ArrayList<Donhang>();
		Donhang dh = new Donhang();
	
		arrdonhang.add(dh);
		for (int i = 0; i < 40; i++) {
			dh = new Donhang();
			arrdonhang.add(dh);

		}
		adapter = new DonhangAdapter(this.getActivity(),
				R.layout.item_donhang, arrdonhang);
		lvdonhang.setAdapter(adapter);
		lvdonhang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				Toast.makeText(getActivity(),
						"Click " + arrdonhang.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				// Intent myIntent = new Intent(getActivity(),
				// KhachActivity.class);
				// startActivity(myIntent);
			}
		});
		lvdonhang.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(getActivity(),
						"Click long " + arrdonhang.get(arg2).toString(),
						Toast.LENGTH_LONG).show();
				return false;
			}
		});

		return rootView;
	}

}
