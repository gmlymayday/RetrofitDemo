package com.example.retrofitdemo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Service {
	@GET("/api/{category}/list")
	// ��ַ�������Ŀ¼ category��ʾ���࣬��Ϊ��Ŀ¼ֻ��һ�㲻һ��
	Call<Tngou> getList(@Path("category") String path, @Query("id") int id,
			@Query("page") int page, @Query("rows") int rows);

	@GET("/api/{category}/show")
	// ��ַ�������Ŀ¼ category��ʾ���࣬��Ϊ��Ŀ¼ֻ��һ�㲻һ��
	Call<Cook> getDetail(@Path("category") String path, @Query("id") String id);
}
