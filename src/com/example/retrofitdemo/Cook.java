package com.example.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * ���� Created by �ϳ� on 16-7-15.
 */
public class Cook {
	@SerializedName("id")
	private int id;
	@SerializedName("name")
	private String name;// ����
	@SerializedName("food")
	private String food;// ʳ��
	@SerializedName("img")
	private String img;// ͼƬ
	@SerializedName("images")
	private String images;// ͼƬ,
	@SerializedName("description")
	private String description;// ����
	@SerializedName("keywords")
	private String keywords;// �ؼ���
	@SerializedName("message")
	private String message;// ��Ѷ����
	@SerializedName("count")
	private int count;// ���ʴ���
	@SerializedName("fcount")
	private int fcount;// �ղ���
	@SerializedName("rcount")
	private int rcount;// ���۶���

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getFcount() {
		return fcount;
	}

	public void setFcount(int fcount) {
		this.fcount = fcount;
	}

	public int getRcount() {
		return rcount;
	}

	public void setRcount(int rcount) {
		this.rcount = rcount;
	}

	@Override
	public String toString() {
		return "Cook [id=" + id + ", name=" + name + ", food=" + food
				+ ", img=" + img + ", images=" + images + ", description="
				+ description + ", keywords=" + keywords + ", message="
				+ message + ", count=" + count + ", fcount=" + fcount
				+ ", rcount=" + rcount + "]";
	}

}