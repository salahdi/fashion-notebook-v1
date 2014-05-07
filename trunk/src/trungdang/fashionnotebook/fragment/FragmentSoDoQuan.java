package trungdang.fashionnotebook.fragment;

import trungdang.fashionnotebook.R;
import trungdang.fashionnotebook.R.layout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSoDoQuan extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_sodoquan, container,
				false);
		return rootView;
	}

}
