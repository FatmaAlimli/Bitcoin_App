package com.example.bitcoinuygulamas.Models;

import com.google.gson.annotations.SerializedName;

public class Stats{

	@SerializedName("total")
	private int total;

	@SerializedName("offset")
	private int offset;

	@SerializedName("totalExchanges")
	private int totalExchanges;

	@SerializedName("limit")
	private int limit;

	@SerializedName("totalMarkets")
	private int totalMarkets;

	@SerializedName("totalMarketCap")
	private double totalMarketCap;

	@SerializedName("total24hVolume")
	private double total24hVolume;

	@SerializedName("order")
	private String order;

	@SerializedName("base")
	private String base;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setTotalExchanges(int totalExchanges){
		this.totalExchanges = totalExchanges;
	}

	public int getTotalExchanges(){
		return totalExchanges;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setTotalMarkets(int totalMarkets){
		this.totalMarkets = totalMarkets;
	}

	public int getTotalMarkets(){
		return totalMarkets;
	}

	public void setTotalMarketCap(double totalMarketCap){
		this.totalMarketCap = totalMarketCap;
	}

	public double getTotalMarketCap(){
		return totalMarketCap;
	}

	public void setTotal24hVolume(double total24hVolume){
		this.total24hVolume = total24hVolume;
	}

	public double getTotal24hVolume(){
		return total24hVolume;
	}

	public void setOrder(String order){
		this.order = order;
	}

	public String getOrder(){
		return order;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"total = '" + total + '\'' + 
			",offset = '" + offset + '\'' + 
			",totalExchanges = '" + totalExchanges + '\'' + 
			",limit = '" + limit + '\'' + 
			",totalMarkets = '" + totalMarkets + '\'' + 
			",totalMarketCap = '" + totalMarketCap + '\'' + 
			",total24hVolume = '" + total24hVolume + '\'' + 
			",order = '" + order + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}