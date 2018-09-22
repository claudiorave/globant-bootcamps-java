// 3. Create a proxy example for database accesor clases.

import java.util.Date;

public class Proxy {

	DBAccesor dbAccesor;

	public Proxy() {
		
		System.out.println("Creating proxy at " + new Date());
		
	}

	public void sayHello() {
		if (dbAccesor == null) {
			dbAccesor = new DBAccesor();
		}
		return dbAccesor;
	}

}