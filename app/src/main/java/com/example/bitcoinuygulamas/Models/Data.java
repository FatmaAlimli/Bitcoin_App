package com.example.bitcoinuygulamas.Models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("coins")
	private List<CoinsItem> coins;

	@SerializedName("base")
	private Base base;

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setCoins(List<CoinsItem> coins){
		this.coins = coins;
	}

	public List<CoinsItem> getCoins(){
		return coins;
	}

	public void setBase(Base base){
		this.base = base;
	}

	public Base getBase(){
		return base;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"stats = '" + stats + '\'' + 
			",coins = '" + coins + '\'' + 
			",base = '" + base + '\'' + 
			"}";
		}
}