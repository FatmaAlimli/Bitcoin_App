package com.example.bitcoinuygulamas.Models;

import com.google.gson.annotations.SerializedName;

public class Base{

	@SerializedName("symbol")
	private String symbol;

	@SerializedName("sign")
	private String sign;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setSign(String sign){
		this.sign = sign;
	}

	public String getSign(){
		return sign;
	}

	@Override
 	public String toString(){
		return 
			"Base{" + 
			"symbol = '" + symbol + '\'' + 
			",sign = '" + sign + '\'' + 
			"}";
		}
}