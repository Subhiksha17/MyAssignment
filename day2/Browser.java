package week1.day2;



public class Browser {
	
	protected void launchBrowser(String browserName) {
		System.out.println(browserName);
	}
	
	String loadUrl() {
		String url="Url loaded successfully";
		return url;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Browser load = new Browser();
     load.launchBrowser("FireFox");
     System.out.println(load.loadUrl());
     Browser other= new Browser();
     

	}
	

}
