package trungdang.fashionnotebook.fragment;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import trungdang.fashionnotebook.KhachActivity;
import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.R.id;
import trungdang.fashionnotebook.R.layout;
import trungdang.fashionnotebook.adapter.KhachArrayAdapter;
import trungdang.fashionnotebook.data.Khach;

public class FragmentKhach extends Fragment {
	KhachArrayAdapter adapter = null;
	ListView lvKhach = null;
	ArrayList<Khach> arrkhach = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_khach, container,
				false);

		lvKhach = (ListView) rootView.findViewById(id.lvkhach);
		arrkhach = new ArrayList<Khach>();
		Khach k = new Khach();
		k.setTen("Dang Tran Trung");
		arrkhach.add(k);
		for (int i = 0; i < 40; i++) {
			k = new Khach();
			arrkhach.add(k);

		}
		adapter = new KhachArrayAdapter(this.getActivity(),
				R.layout.item_khach, arrkhach);
		lvKhach.setAdapter(adapter);
		lvKhach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
// chuan bi du lieu chuyen sang activity khach 1
				Intent myIntent = new Intent(getActivity(), KhachActivity.class);
				startActivity(myIntent);
			}
		});
		lvKhach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// chuan bi du lieu chuyen sang activity khach  2
				Intent myIntent = new Intent(getActivity(), KhachActivity.class);
				startActivity(myIntent);
			return false;
			}
		});
		return rootView;
	}

}
