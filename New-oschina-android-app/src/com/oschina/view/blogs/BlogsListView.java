package com.oschina.view.blogs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;
import com.oschina.controller.blogs.BlogListAction;
import net.oschina.app.holo.R;

public class BlogsListView extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_listitem, null, false);
	}
	
	public BlogListAction blogListAction;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		blogListAction = new BlogListAction(getActivity(), new AQuery(getView()));
		int category = getArguments().getInt("category");
		
		blogListAction.initBlogListView(R.id.frame_listview_news, category);
	}
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
