import junit.framework.Assert;
import org.junit.Test;
public class TestClassTest {
	
	@Test
	public void testAdd() {

		Assert.assertEquals(TestClass.add(4, 5), 9);

	}

}
