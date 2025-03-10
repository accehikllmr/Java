package Lab4;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JunitTestsLab4_moreTestCases {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
// TEST CASES FOR FAN OBJECT
	
	@Test
	public void testPb_01_01() {
		assertEquals("Test 01_01 failed", "fan is off, Color: blue, Radius: 5.0", (new Fan()).toString());
	}

	@Test
	public void testPb_01_02() {
		Fan f = new Fan(Fan.FAST, Fan.ON, 3.0, "red");
		assertEquals("Test 01_02 failed", "Speed: FAST, Color: red, Radius: 3.0", f.toString());
	}
	
	/* testing accessor and mutator methods, repeating accessors for customer constructors since it should 
	 * prevent specific values from being passed to method parameters (e.g. invalid attribute values)
	 */
	@Test
	public void testPb_01_03() {
		Fan f = new Fan();
		assertEquals("Test 01_03 failed", 1, f.getSpeed(), 0.0);
	}
	
	@Test
	public void testPb_01_04() {
		Fan f = new Fan();
		assertEquals("Test 01_04 failed", false, f.getStatus());
	}
	
	@Test
	public void testPb_01_05() {
		Fan f = new Fan();
		assertEquals("Test 01_05 failed", 5.0, f.getRadius(), 0.0);
	}
	
	@Test
	public void testPb_01_06() {
		Fan f = new Fan();
		assertEquals("Test 01_06 failed", "blue", f.getColor());
	}
	
	@Test // invalid values for Fan object speed attribute
	public void testPb_01_07() {
		Fan f = new Fan(0, true, 3.0, "red");
		Fan g = new Fan(4, true, 3.0, "red");
		assertEquals("Test 01_07 failed", f.getSpeed(), g.getSpeed(), 0.0);
	}
	
	@Test // invalid values for Fan object radius attribute
	public void testPb_01_08() {
		Fan f = new Fan(1, true, 0.0, "red");
		assertEquals("Test 01_08 failed", 5.0, f.getRadius(), 0.0);
	}
	
	@Test
	public void testPb_01_09() {
		Fan f = new Fan(1, true, 2.0, "red");
		f.setSpeed(2);
		assertEquals("Test 01_09 failed", 2, f.getSpeed(), 0.0);
	}
	
	@Test
	public void testPb_01_10() {
		Fan f = new Fan(1, true, 2.0, "red");
		f.setSpeed(0);
		assertEquals("Test 01_10 failed", 1, f.getSpeed(), 0.0);
	}
	
	@Test
	public void testPb_01_11() {
		Fan f = new Fan(1, true, 2.0, "red");
		f.setSpeed(4);
		assertEquals("Test 01_10 failed", 1, f.getSpeed(), 0.0);
	}
	
	@Test
	public void testPb_01_12() {
		Fan f = new Fan(1, true, 2.0, "red");
		f.setRadius(10.0);
		assertEquals("Test 01_12 failed", 10.0, f.getRadius(), 0.0);
	}
	
	@Test
	public void testPb_01_13() {
		Fan f = new Fan(1, true, 2.0, "red");
		f.setRadius(0.0);
		assertEquals("Test 01_13 failed", 2.0, f.getRadius(), 0.0);
	}
	
	@Test
	public void testPb_01_14() {
		Fan f = new Fan(1, true, 5.0, "red");
		f.setStatus(false);
		assertEquals("Test 01_14 failed", false, f.getStatus());
	}
	
	@Test
	public void testPb_01_15() {
		Fan f = new Fan(1, true, 5.0, "red");
		f.setColor("brown");
		assertEquals("Test 01_15 failed", "brown", f.getColor());
	}
	
	@Test
	public void testPb_01_16() {
		Fan f = new Fan(3, true, 10.0, "red");
		assertEquals("Test 01_16 failed", 150.0, f.getCoverage(), 0.0);
	}
	
	@Test
	public void testPb_01_17() {
		Fan f = new Fan(2, true, 11.4, "red");
		assertEquals("Test 01_17 failed", 114.0, f.getCoverage(), 0.0);
	}
	
	@Test
	public void testPb_01_18() {
		Fan f = new Fan(0, true, 10.0, "red");
		assertEquals("Test 01_18 failed", 50.0, f.getCoverage(), 0.0);
	}
	
	@Test
	public void testPb_01_19() {
		Fan f = new Fan(3, true, 0.0, "red");
		assertEquals("Test 01_19 failed", 75.0, f.getCoverage(), 0.0);
	}
	
	@Test
	public void testPb_01_20() {
		Fan f = new Fan(4, true, 0.0, "red");
		assertEquals("Test 01_20 failed", 25.0, f.getCoverage(), 0.0);
	}
	
	@Test
	public void testPb_01_21() {
		Fan f = new Fan(2, true, 10.0, "red");
		assertEquals("Test 01_21 failed", false, f.isSuitable(25.1));
	}
	
	@Test
	public void testPb_01_22() {
		Fan f = new Fan(2, true, 10.0, "red");
		assertEquals("Test 01_21 failed", true, f.isSuitable(25.0));
	}
	
	@Test
	public void testPb_01_23() {
		Fan f = new Fan(2, true, 10.0, "red");
		assertEquals("Test 01_23 failed", true, f.isSuitable(20.0));
	}
	
	@Test
	public void testPb_01_24() {
		Fan f = new Fan(2, true, 10.0, "red");
		assertEquals("Test 01_24 failed", true, f.isSuitable(15.0));
	}
	
	@Test
	public void testPb_01_25() {
		Fan f = new Fan(2, true, 10.0, "red");
		assertEquals("Test 01_25 failed", false, f.isSuitable(14.9));
	}
	
// TEST CASES FOR ROOMDIMENSION OBJECT
	
	@Test
	public void testPb_02_01() {
		assertEquals("Test 02_01 failed", "Length: 5.0, Width: 5.0", (new RoomDimension(5.0, 5.0)).toString());
	}

	@Test
	public void testPb_02_02() {
		assertEquals("Test 02_02 failed", true, (new RoomDimension(5.0, 5.0)).equals(new RoomDimension(5.0, 5.0)));
	}
	@Test
	public void testPb_02_03() {
		assertEquals("Test 02_03 failed", true, (new RoomDimension(5.0, 5.0)).isFanSuitable(new Fan(Fan.FAST, Fan.ON, 15.0, "red")));
	}
	@Test
	public void testPb_03_01() {
		assertEquals("Test 03_01 failed", 0.0, (new HouseCarpet(1, 0.0)).getCarpetCost(), 0.0);
	}

	@Test
	public void testPb_03_02() {
		assertArrayEquals("Test 03_02 failed", new double []{0.0}, (new HouseCarpet(1, 0.0)).getRoomCosts(), 0.0);
	}

	@Test
	public void testPb_03_03() {
		HouseCarpet h = new HouseCarpet(1, 2.0);
		RoomDimension [] rs = new RoomDimension [1];
		rs[0] = new RoomDimension(5.0, 4.0);
		h.setRooms(rs);
		assertEquals("Test 03_03 failed", 40.0, h.getCarpetCost(), 0.0);
	}
	@Test
	public void testPb_03_04() {
		HouseCarpet h = new HouseCarpet(1, 2.0);
		RoomDimension [] rs = new RoomDimension [1];
		rs[0] = new RoomDimension(5.0, 5.0);
		h.setRooms(rs);
		assertEquals("Test 03_03 failed", 1, h.isFanSuitable(new Fan(Fan.FAST, Fan.ON, 15.0, "red")));
	}
	
}