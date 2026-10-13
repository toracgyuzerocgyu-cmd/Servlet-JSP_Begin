package model;

import java.util.List;

public class PostMutterLogic {
  public void execute(Mutter mutter, List<Mutter> mutterList) {
    mutterList.add(0, mutter); // 先頭に追加 解説①
  }
  public void liked(List<Mutter> mutterList,int no) {
	  /*
	  mutterList.get(mutterList.size() - 1 - no).setLike(mutterList.get(mutterList.size() - 1 - no).getLike()+1);
	  */
	  mutterList.get(no).setLike(mutterList.get(no).getLike()+1);
  }
  public void disliked(List<Mutter> mutterList,int no) {
	  /*
	  mutterList.get(mutterList.size() - 1 - no).setDislike(mutterList.get(mutterList.size() - 1 - no).getDislike()+1);
  	  */
	  mutterList.get(no).setDislike(mutterList.get(no).getDislike()+1);
  }
}