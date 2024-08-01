import static org.junit.Assert.*;

import org.junit.Test;

public class MachineTest {
	
	@Test
	public void testing_bulldozer() {
		Machine parent = new Machine();
		Bulldozer child = new Bulldozer();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_excavator() {
		Machine parent = new Machine();
		Excavator child = new Excavator();
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}
}