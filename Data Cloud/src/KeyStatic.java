import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyStatic {
	static SecretKey secretKeystaticKey = null,secretKey = null;
	static int flag =0;
	public static SecretKey key () throws Exception {
		// TODO Auto-generated method stub
		
		
		if(flag ==0) {
		
			flag++;
			
			// secretKey = keyStatic();
			 
				 secretKey =KeyGenerator.getInstance("AES").generateKey();
				 //System.out.println("\n\n\nNew genrated: flag : "+flag+"\n");
		}
		else {
			flag++;
			// System.out.println("Skipped: "+flag+"\n");

		}

	secretKeystaticKey = secretKey;
	return secretKeystaticKey;
			
	}
	

}
