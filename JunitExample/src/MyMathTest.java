import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class MyMathTest {

	@Rule
 	public ExpectedException thrown = ExpectedException.none();

	
	
	@Test
	public void add() {
		assertEquals(5, MyMath.add(3, 2));
		assertEquals(6, MyMath.add(3, 3));
	}
	
	@Test
	public void devide() {
		assertEquals(5, MyMath.devide(10, 2), 2);
	}
	
	@Test
	public void devideByZero() {
		thrown.expect(ArithmeticException.class);
		assertEquals(5, MyMath.devide(10, 0), 2);
	}
	
}
