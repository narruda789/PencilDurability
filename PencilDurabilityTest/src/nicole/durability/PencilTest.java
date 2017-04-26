package nicole.durability;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import nicole.durability.mocks.*;
import nicole.test.*;

public class PencilTest extends TestHelper {

	@Test
	public void testImplementsInterface() throws Exception {
		assertImplementsInterface(Pencil.class, PencilInterface.class);
	}

	@Test
	public void testWriteOnPaper() throws Exception {
		PencilInterface pencil = new Pencil();
		MockPaper mockPaper = new MockPaper();
		String expectedTextWrittenToPaper = "What a long, strange trip it's been.";

		pencil.writeOnPaper(mockPaper, expectedTextWrittenToPaper);

		String actualTextWrittenToPaper = mockPaper.getTextWrittenToPaper();
		assertEquals(expectedTextWrittenToPaper, actualTextWrittenToPaper);
	}
}
