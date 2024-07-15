import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ak.GitProj1.Subtraction;

public class SubtractionTest {
	
	public void testWithPostiveNumber() {
		Subtraction sub1=new Subtraction();
		int actual=sub1.sub(20, 10);
		int expected=10;
		assertEquals(expected, actual);
	}

}
