package model;

import java.io.Serializable;

public class Mutter implements Serializable {
  private String userName; // ユーザー名
  private String text; // つぶやき内容
	private int like;	//よいね数
	private int dislike;//よくないね数

  public Mutter() {
  }

  public Mutter(String userName, String text) {
    this.userName = userName;
    this.text = text;
  	this.like = 0;
  	this.dislike = 0;
  }

  public String getUserName() {
    return userName;
  }

  public String getText() {
    return text;
  }

public int getLike() {
	return like;
}

public void setLike(int like) {
	this.like = like;
}

public int getDislike() {
	return dislike;
}

public void setDislike(int dislike) {
	this.dislike = dislike;
}

}