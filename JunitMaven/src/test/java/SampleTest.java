import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTestPass(){
		
	int a = 2;
	int b = 3;
	int c = a+b;
	System.out.println("ResultPass :"+c);
    assertTrue(a+b == 5);
	
	}

	@Test
	public void simpleTestFail(){
		
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println("ResultFail :"+c);
	    assertTrue(a+b == 4);
		
	
	}
}
