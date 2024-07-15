import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

import com.ak.GitProj1.Arthametic;
 
public class ArthameticTest {
	
	
	
	
	@Test
	public void testWithPostiveNumber() {
		Arthametic ar=new Arthametic();
	

	
		int actual=ar.sum(20, 300);
		int expected=320;

		assertEquals(expected, actual);
	
	}
	

}
