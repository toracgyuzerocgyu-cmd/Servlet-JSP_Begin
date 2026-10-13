package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private String userName; // ユーザー名
	private String text; // つぶやき内容
	private int likes;
	private int disLikes;
	
	public Mutter() {}
	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
		this.likes = 0;
		this.disLikes = 0;
	}
	
	public void setLikes(int likes) { this.likes = likes; }
	public void setDisLikes(int disLikes) { this.disLikes = disLikes; }
	
	public void addLikes() {
		int count = this.likes;
		this.setLikes(count + 1);
	}

	public void addDisLikes() {
		int count = this.disLikes;
		this.setDisLikes(count + 1);
	}
	
	public String getUserName() { return userName; }
	public String getText() { return text; }
	public int getLikes() { return likes; }
	public int getDisLikes() { return disLikes; }
}
