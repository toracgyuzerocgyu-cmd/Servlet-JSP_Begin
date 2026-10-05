package gym;

public class UseCacheLogic {
	public void execute(UseCache chache) {
		String[] opt = chache.getOpt();
		int charge = chache.getCharge();
		
		for(int i = 0; i < opt.length; i++) {
			if(Integer.parseInt(opt[i]) > 0) {
				charge += Integer.parseInt(opt[i]);
			}
		}
		
		chache.setCharge(charge);
	}
}