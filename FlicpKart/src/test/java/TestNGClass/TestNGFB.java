package TestNGClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGFB {
	
	@BeforeClass
	public void toGetMobile() {
		System.out.println("toMobile");
		
	}
	@Test
	public void toFindMobie() {
		System.out.println("FindMobile");
	}
	}


