package multipleInheritance;

public interface SwhizzBank extends SBI,HDFC,ICICI {//is a relatonship
int minbal=2000;
	public void personaloan();

	public void marketing();
}
