package model;

import java.io.Serializable;

public class SiteEV implements Serializable {
  private int like; // The number of "like"
  private int dislike; // The number of "dislike"
  
  public SiteEV() {
    setLike(0);
    setDislike(0);
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
