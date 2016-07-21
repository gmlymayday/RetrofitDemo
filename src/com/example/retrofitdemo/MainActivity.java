package com.example.retrofitdemo;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements Callback<Tngou>,
		OnItemClickListener {
	private ListView lv_list;
	private CookAdapter adapter;
	List<Cook> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://www.tngou.net")
				.addConverterFactory(GsonConverterFactory.create()).build();
		Service service = retrofit.create(Service.class);
		Call<Tngou> call = service.getList("cook", 0, 1, 100);
		call.enqueue(this);
		lv_list = (ListView) findViewById(R.id.lv_list);
		lv_list.setOnItemClickListener(this);
		list = new ArrayList<Cook>();
	}

	@Override
	public void onResponse(Response<Tngou> arg0, Retrofit arg1) {
		list = arg0.body().getList();
		adapter = new CookAdapter(MainActivity.this, list);
		lv_list.setAdapter(adapter);
	}

	@Override
	public void onFailure(Throwable arg0) {
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Intent intent = new Intent(this, DetailActivity.class);
		intent.putExtra("id", list.get(position).getId() + "");
		startActivity(intent);
	}
}
