package com.example.retrofitdemo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Service {
	@GET("/api/{category}/list")
	// 网址下面的子目录 category表示分类，因为子目录只有一点不一样
	Call<Tngou> getList(@Path("category") String path, @Query("id") int id,
			@Query("page") int page, @Query("rows") int rows);

	@GET("/api/{category}/show")
	// 网址下面的子目录 category表示分类，因为子目录只有一点不一样
	Call<Cook> getDetail(@Path("category") String path, @Query("id") String id);
}
