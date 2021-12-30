package Composite_Design_Pattern;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Composite Entertainment = new Composite("Entertainment");
		Composite Videos = new Composite("Videos");
		Composite Movies = new Composite("Movies");
		Composite Software = new Composite("Software");
		
		Leaf pani_pani = new Leaf("Pani Pani.mp4", "mp4", "Opened");
		Leaf baba_amar_ki_biye_hobe_na = new Leaf("baba_amar_ki_biye_hobe_na.mp4", "mp4", "Opened");
		Leaf eclipse = new Leaf("Eclipse.exe", "exe", "Closed");
		Leaf Mohanogor = new Leaf("Mohanogor.mp4", "mp4", "Opened");
		
		Entertainment.addFolder(Videos);
		Entertainment.addFolder(Movies);
		Videos.addFolder(pani_pani);
		Videos.addFolder(baba_amar_ki_biye_hobe_na);
		Movies.addFolder(Mohanogor);
		Software.addFolder(eclipse);
		
		Entertainment.Screen();
		
		
		
		
		

	}

}
