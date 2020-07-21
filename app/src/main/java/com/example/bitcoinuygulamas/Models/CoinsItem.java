package com.example.bitcoinuygulamas.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoinsItem extends Response2 {

	@SerializedName("symbol")
	private String symbol;

	@SerializedName("color")
	private String color;

	@SerializedName("penalty")
	private boolean penalty;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private String type;

	@SerializedName("uuid")
	private String uuid;

	@SerializedName("circulatingSupply")
	private float circulatingSupply;

	@SerializedName("websiteUrl")
	private String websiteUrl;

	@SerializedName("allTimeHigh")
	private AllTimeHigh allTimeHigh;

	@SerializedName("price")
	private float price;

	@SerializedName("iconType")
	private String iconType;

	@SerializedName("rank")
	private int rank;

	@SerializedName("links")
	private List<LinksItem> links;

	@SerializedName("approvedSupply")
	private boolean approvedSupply;

	@SerializedName("id")
	private int id;

	@SerializedName("iconUrl")
	private String iconUrl;

	@SerializedName("socials")
	private List<SocialsItem> socials;

	@SerializedName("slug")
	private String slug;

	@SerializedName("marketCap")
	private long marketCap;

	@SerializedName("numberOfMarkets")
	private int numberOfMarkets;

	@SerializedName("confirmedSupply")
	private boolean confirmedSupply;

	@SerializedName("totalSupply")
	private float totalSupply;

	@SerializedName("firstSeen")
	private long firstSeen;

	@SerializedName("change")
	private double change;

	@SerializedName("history")
	private List<String> history;

	@SerializedName("volume")
	private long volume;

	@SerializedName("name")
	private String name;

	@SerializedName("numberOfExchanges")
	private int numberOfExchanges;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setPenalty(boolean penalty){
		this.penalty = penalty;
	}

	public boolean isPenalty(){
		return penalty;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}

	public void setCirculatingSupply(float circulatingSupply){
		this.circulatingSupply = circulatingSupply;
	}

	public float getCirculatingSupply(){
		return circulatingSupply;
	}

	public void setWebsiteUrl(String websiteUrl){
		this.websiteUrl = websiteUrl;
	}

	public String getWebsiteUrl(){
		return websiteUrl;
	}

	public void setAllTimeHigh(AllTimeHigh allTimeHigh){
		this.allTimeHigh = allTimeHigh;
	}

	public AllTimeHigh getAllTimeHigh(){
		return allTimeHigh;
	}

	public void setPrice(float price){
		this.price = price;
	}

	public float getPrice(){
		return price;
	}

	public void setIconType(String iconType){
		this.iconType = iconType;
	}

	public String getIconType(){
		return iconType;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setLinks(List<LinksItem> links){
		this.links = links;
	}

	public List<LinksItem> getLinks(){
		return links;
	}

	public void setApprovedSupply(boolean approvedSupply){
		this.approvedSupply = approvedSupply;
	}

	public boolean isApprovedSupply(){
		return approvedSupply;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setSocials(List<SocialsItem> socials){
		this.socials = socials;
	}

	public List<SocialsItem> getSocials(){
		return socials;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setMarketCap(long marketCap){
		this.marketCap = marketCap;
	}

	public long getMarketCap(){
		return marketCap;
	}

	public void setNumberOfMarkets(int numberOfMarkets){
		this.numberOfMarkets = numberOfMarkets;
	}

	public int getNumberOfMarkets(){
		return numberOfMarkets;
	}

	public void setConfirmedSupply(boolean confirmedSupply){
		this.confirmedSupply = confirmedSupply;
	}

	public boolean isConfirmedSupply(){
		return confirmedSupply;
	}

	public void setTotalSupply(float totalSupply){
		this.totalSupply = totalSupply;
	}

	public float getTotalSupply(){
		return totalSupply;
	}

	public void setFirstSeen(long firstSeen){
		this.firstSeen = firstSeen;
	}

	public long getFirstSeen(){
		return firstSeen;
	}

	public void setChange(double change){
		this.change = change;
	}

	public double getChange(){
		return change;
	}

	public void setHistory(List<String> history){
		this.history = history;
	}

	public List<String> getHistory(){
		return history;
	}

	public void setVolume(long volume){
		this.volume = volume;
	}

	public long getVolume(){
		return volume;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNumberOfExchanges(int numberOfExchanges){
		this.numberOfExchanges = numberOfExchanges;
	}

	public int getNumberOfExchanges(){
		return numberOfExchanges;
	}

	@Override
 	public String toString(){
		return 
			"CoinsItem{" + 
			"symbol = '" + symbol + '\'' + 
			",color = '" + color + '\'' + 
			",penalty = '" + penalty + '\'' + 
			",description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",uuid = '" + uuid + '\'' + 
			",circulatingSupply = '" + circulatingSupply + '\'' + 
			",websiteUrl = '" + websiteUrl + '\'' + 
			",allTimeHigh = '" + allTimeHigh + '\'' + 
			",price = '" + price + '\'' + 
			",iconType = '" + iconType + '\'' + 
			",rank = '" + rank + '\'' + 
			",links = '" + links + '\'' + 
			",approvedSupply = '" + approvedSupply + '\'' + 
			",id = '" + id + '\'' + 
			",iconUrl = '" + iconUrl + '\'' + 
			",socials = '" + socials + '\'' + 
			",slug = '" + slug + '\'' + 
			",marketCap = '" + marketCap + '\'' + 
			",numberOfMarkets = '" + numberOfMarkets + '\'' + 
			",confirmedSupply = '" + confirmedSupply + '\'' + 
			",totalSupply = '" + totalSupply + '\'' + 
			",firstSeen = '" + firstSeen + '\'' + 
			",change = '" + change + '\'' + 
			",history = '" + history + '\'' + 
			",volume = '" + volume + '\'' + 
			",name = '" + name + '\'' + 
			",numberOfExchanges = '" + numberOfExchanges + '\'' + 
			"}";
		}
}