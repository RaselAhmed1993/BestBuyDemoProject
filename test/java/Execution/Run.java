package Execution;

import org.testng.annotations.Test;

import Open_Close_Browser.Open_Close;

public class Run {
	
	
	@Test
	public void run() 
	{
		Open_Close oc = new Open_Close();
		oc.Open();
		oc.Close();
	}

}
