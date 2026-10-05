package model;

import java.io.Serializable;

public class Gym implements Serializable {

	private String name;
	private String area;
	private String[] option;
	private String yakan_req="不使用";
	private String net_req="不使用";
	private String ball_req="不使用";
	private int price;
	public Gym() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Gym(String name,String area,String[] option) {
		setName(name);
		setArea(area);
		setOption(option);
		setPrice(2000);
	}
	public String getYakan_req() {
		return yakan_req;
	}
	public void setYakan_req(String yakan_req) {
		this.yakan_req = yakan_req;
	}
	public String getNet_req() {
		return net_req;
	}
	public void setNet_req(String net_req) {
		this.net_req = net_req;
	}
	public String getBall_req() {
		return ball_req;
	}
	public void setBall_req(String ball_req) {
		this.ball_req = ball_req;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String[] getOption() {
		return option;
	}
	public void setOption(String[] option) {
		this.option = option;
	}

}
