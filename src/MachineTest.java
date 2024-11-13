import static org.junit.Assert.*;

import org.junit.Test;

import machines.*;

public class MachineTest {
	
	@Test
	public void testing_bulldozer() {
		// Testing inheritance.
		Machine parent = new Machine();
		Bulldozer child = new Bulldozer();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
		// Testing Constructor.
		Bulldozer child2 = new Bulldozer("ab", "bc", 20.5f, 30.0f);
		assertEquals("ab", child2.make);
	}

	@Test
	public void testing_excavator() {
		// Testing inheritance.
		Machine parent = new Machine();
		Excavator child = new Excavator();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
		// Testing constructor.
		Excavator child2 = new Excavator("ab", "bc", 20.5f, 30.0f);
		assertEquals("ab", child2.make);
	}
}