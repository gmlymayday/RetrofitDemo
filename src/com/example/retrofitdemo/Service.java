package com.example.retrofitdemo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Service {
	// 列表
	@GET("/api/{category}/list")
	Call<Tngou> getList(@Path("category") String path, @Query("id") int id,
			@Query("page") int page, @Query("rows") int rows);

	// 详情
	@GET("/api/{category}/show")
	Call<Cook> getDetail(@Path("category") String path, @Query("id") String id);
}
