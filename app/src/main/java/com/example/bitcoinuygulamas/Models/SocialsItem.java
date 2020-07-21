package com.example.bitcoinuygulamas.Models;

import com.google.gson.annotations.SerializedName;

public class SocialsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"SocialsItem{" + 
			"name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}