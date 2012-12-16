package com.oschina.view.news;

import net.oschina.app.holo.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidquery.AQuery;
import com.oschina.controller.news.NewsListAction;

public class NewsListView extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_listitem, null, false);
	}
	
	public NewsListAction newsListAction;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		newsListAction = new NewsListAction(getActivity(), new AQuery(getView()));
		newsListAction.initNewsList(R.id.frame_listview_news);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
	}
	
	
	
	
	
}
