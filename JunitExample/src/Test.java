
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class Test {
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	@Before
	public void before() {
		System.out.println("before()");
	}
	

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@org.junit.Test
	public void expectRuntime() {
		thrown.expect(RuntimeException.class);
		throw new RuntimeException();
	}
	
	@org.junit.Test
	public void expectRuntime2() {
		thrown.expect(RuntimeException.class);
		throw new ArithmeticException();
	}
	
	@org.junit.Test
	public void expectRuntimeMessage() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("anil");
		throw new RuntimeException("anil");
	}
	
	@org.junit.Test
	public void expectRuntimeMessage2() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("anil");
		throw new RuntimeException("anil2");
	}
	
	@org.junit.Test
	public void expectRuntimeMessage3() {
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("ara");
		throw new RuntimeException("bharadia");
	}
	
	@org.junit.Test
	public void expectRuntimeMessage4() {
		thrown.expect(RuntimeException.class);
		
		thrown.expectMessage("anil");
		thrown.expectMessage("bharadia");
		throw new RuntimeException("anilbharadia");
	}
	
	
	@Ignore
	@org.junit.Test
	public void expectRuntimeMessage5() throws Exception {
		thrown.expect(RuntimeException.class);
		thrown.expect(ArithmeticException.class);
		throw new Exception();
	}
	
	@org.junit.Test
	public void expectRuntimeMessage6() throws Exception {
		thrown.expect(RuntimeException.class);
		thrown.expect(ArithmeticException.class);
		throw new ArithmeticException();
	}
	
	@org.junit.Test
	public void expectRuntimeMessage7() throws Exception {
		thrown.expect(RuntimeException.class);
		thrown.expect(ArithmeticException.class);
		throw new RuntimeException();
	}
	
	@org.junit.Test
	public void expectRuntimeMessage8() throws Exception {
		thrown.expect(ArithmeticException.class);
		thrown.expect(RuntimeException.class);
		throw new RuntimeException();
	}
	
	@org.junit.Test
	public void expectRuntimeMessage9() throws Exception {
		thrown.expect(RuntimeException.class);
		throw new ArithmeticException();
	}
	
	
	@org.junit.Test
	public void assertTrue1() {
		assertTrue(true);
	}
	
	
	
	@After
	public void after() {
		System.out.println("after()");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	
	
}
