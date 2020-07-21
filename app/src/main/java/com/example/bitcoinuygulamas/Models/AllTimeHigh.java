package com.example.bitcoinuygulamas.Models;

import com.google.gson.annotations.SerializedName;

public class AllTimeHigh{

	@SerializedName("price")
	private String price;

	@SerializedName("timestamp")
	private long timestamp;

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setTimestamp(long timestamp){
		this.timestamp = timestamp;
	}

	public long getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"AllTimeHigh{" + 
			"price = '" + price + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}