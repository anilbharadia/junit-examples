import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyStringUtilsTest {

	@Test
	public void isEmpty() {
		assertEquals(true, MyStringUtils.isEmpty(" "));
		assertEquals(true, MyStringUtils.isEmpty(""));
		assertEquals(true, MyStringUtils.isEmpty(null));
		
		assertEquals(false, MyStringUtils.isEmpty("a"));
		assertEquals(true, MyStringUtils.isEmpty("a"));
	}
	
}
