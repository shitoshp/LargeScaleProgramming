import java.io.IOException;

public class myDriver {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PhoneDirectory directory = new PhoneDirectory("/txtfile");
		directory.getNumber("Shitosh1");      //adding to directory
		directory.changeEntry("Shitosh1", "2027306684");  //change
	}

}