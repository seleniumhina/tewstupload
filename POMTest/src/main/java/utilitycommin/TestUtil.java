package utilitycommin;

import java.io.IOException;

import baseclassmain.baseclass;

public class TestUtil extends baseclass {

	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static final long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
    

   public void switchtoframe()
   {
	  driver.switchTo().frame("meta");
	 
	driver.switchTo().defaultContent(); //
	   
	   
   }


	




}


