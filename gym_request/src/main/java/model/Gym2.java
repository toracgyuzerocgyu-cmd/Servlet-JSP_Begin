package model;

import java.io.Serializable;

public class Gym2 implements Serializable {

	private String name;
	private int base;
	private String area;
	private String option[];
	private String yakan_req="不使用";
	private String net_req="不使用";
	private String ball_req="不使用";
	private int price;
	public Gym2() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Gym2(String name,String area,String[] option) {
		setName(name);
		setArea(area);
		setOption(option);
		if(area.equals("新宿区")) {
			setBase(3000);
		}else if( area.equals("千代田区") ) {
			setBase(2500);
		}else if( area.equals("港区") ) {
			setBase(2000);
		}
		setPrice(getBase());
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
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public String[] getOption() {
		return option;
	}
	public void setOption(String[] option) {
		this.option = option;
	}

}
