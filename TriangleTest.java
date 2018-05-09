package test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
	Triangle a = new Triangle(1, 2, 2);
	Triangle b = new Triangle(1, 1, 2);
    Triangle c = new Triangle(2, 2, 2);
    Triangle d = new Triangle(2, 3, 4);
	Triangle e = new Triangle(0, 1, 2);

	long[] s = {1,2,2};


	@Test
	public void testIsTriangle() {
		assertEquals(false, b.isTriangle(b));
	    assertEquals(true, a.isTriangle(a));
	    assertEquals(false, e.isTriangle(e));
	}

	@Test
	public void testGetType() {
		assertEquals("Illegal", b.getType(b));
		assertEquals("Isosceles", a.getType(a));
		assertEquals("Regular", c.getType(c));
		assertEquals("Scalene", d.getType(d));
	}

	@Test
	public void testGetBorders() {
		assertEquals(s, a.getBorders());
	}
}
