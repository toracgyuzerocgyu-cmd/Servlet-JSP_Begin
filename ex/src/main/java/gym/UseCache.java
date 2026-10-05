package gym;

import java.io.Serializable;

public class UseCache implements Serializable{
	private String name;
	private String district;
	private String[] opt = new String[3];
	private int charge;
	
	public UseCache() {	}
	public UseCache(String name, String district, String[] opt, int charge) {
		this.name = name;
		this.district = district;
		this.opt = opt;
		this.charge = charge;
	}
	
	public void setName(String name) {this.name = name;}
	public void setDistrict(String district) {this.district = district;}
	public void setOpt(String[] opt) {this.opt = opt;}
	public void setCharge(int charge) {this.charge = charge;}
	
	public String getName() {return name;}
	public String getDistrict() {return district;}
	public String[] getOpt() {return opt;}
	public int getCharge() {return charge;}	
}