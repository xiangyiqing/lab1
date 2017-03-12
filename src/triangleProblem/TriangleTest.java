package triangleProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	private static Triangle triangle = new Triangle();

	@Before
	public void setUp() throws Exception {
		triangle.clear();
	}

	@Test
	public void testEquilateral() {
		assertEquals(true,triangle.equilateral(3,3,3));
		assertEquals(false,triangle.equilateral(4,3,3));
	}
	
	@Test
	public void testIsosceles() {
		assertEquals(true,triangle.isosceles(4,3,3));
		assertEquals(false,triangle.isosceles(4,3,2));
	}
	
	@Test
	public void testScalene() {
		assertEquals(true,triangle.scalene(4,3,2));
		assertEquals(false,triangle.scalene(3,3,3));
	}
}
