import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MainTest {
	
	
	private Student testable;

	@Before
	void setup() throws Exception{
		this.testable.run();
	}	
	
	@Test
	void test() throws Exception {
		
		assertEquals("Hello", this.testable.run());
		fail("Not yet implemented");
	}

}
