package model;

public class GymRequestLogic {

	public void execute(Gym gym) {
		String[] option = gym.getOption();
		if(option != null) {
			for(int i = 0;i < option.length;i++ ) {
				if("1000".equals(option[i])) {
					gym.setPrice(gym.getPrice()+1000);
					gym.setYakan_req("<span class=\"red\">使用</span>");
				}else if("300".equals(option[i])) {
					gym.setPrice(gym.getPrice()+300);
					gym.setNet_req("<span class=\"red\">使用</span>");
				}else if("400".equals(option[i])) {
					gym.setPrice(gym.getPrice()+400);
					gym.setBall_req("<span class=\"red\">使用</span>");
				}
			}
		}
	}
}
