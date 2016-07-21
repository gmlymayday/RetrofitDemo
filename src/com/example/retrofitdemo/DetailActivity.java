package com.example.retrofitdemo;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class DetailActivity extends Activity implements Callback<Cook> {
	private TextView tv_detail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		tv_detail = (TextView) findViewById(R.id.tv_detail);
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://www.tngou.net")
				.addConverterFactory(GsonConverterFactory.create()).build();
		Service service = retrofit.create(Service.class);
		Call<Cook> call = service.getDetail("cook",
				getIntent().getStringExtra("id"));
		call.enqueue(this);
	}

	@Override
	public void onFailure(Throwable arg0) {
	}

	@Override
	public void onResponse(Response<Cook> arg0, Retrofit arg1) {
		Spanned spanned = Html.fromHtml(arg0.body().getMessage());
		tv_detail.setText(spanned);
	}
}
