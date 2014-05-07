package trungdang.fashionnotebook.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import trungdang.fashionnotebook.fragment.*;


public class TabPagerAdapter extends FragmentPagerAdapter {
	
	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = null;

		switch (position) {
		case 0:
			fragment = new FragmentMain();
			break;
		case 1:
			fragment = new FragmentKhach();
			
			break;
		case 2:
			fragment = new FragmentDonHang();
			break;
		case 3:
			fragment = new FragmentSanPham();
			break;
		case 4:
			fragment = new FragmentNguyenLieu();
			break;		
		default:
			break;
		}
		return fragment;
	}	

	@Override
	public int getCount() {
		return 5;
	}
}
