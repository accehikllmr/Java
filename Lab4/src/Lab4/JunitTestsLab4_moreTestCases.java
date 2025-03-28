package Lab4;

import static org.junit.Assert.*;

import java.util.Arrays;

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
	
	@Test
	public void testPb_01_202() {
		Fan f = new Fan(Fan.FAST, Fan.OFF, 3.0, "red");
		assertEquals("Test 01_202 failed", "fan is off, Color: red, Radius: 3.0", f.toString());
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
		assertEquals("Test 01_16 failed", 150.0, f.getCoverage(f.getSpeed()), 0.0);
	}
	
	@Test
	public void testPb_01_17() {
		Fan f = new Fan(2, true, 11.4, "red");
		assertEquals("Test 01_17 failed", 114.0, f.getCoverage(f.getSpeed()), 0.0);
	}
	
	@Test
	public void testPb_01_18() {
		Fan f = new Fan(0, true, 10.0, "red");
		assertEquals("Test 01_18 failed", 50.0, f.getCoverage(f.getSpeed()), 0.0);
	}
	
	@Test
	public void testPb_01_19() {
		Fan f = new Fan(3, true, 0.0, "red");
		assertEquals("Test 01_19 failed", 75.0, f.getCoverage(f.getSpeed()), 0.0);
	}
	
	@Test
	public void testPb_01_20() {
		Fan f = new Fan(4, true, 0.0, "red");
		assertEquals("Test 01_20 failed", 25.0, f.getCoverage(f.getSpeed()), 0.0);
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
	public void testPb_02_04() {
		RoomDimension r = new RoomDimension();
		assertEquals("Test 02_04 failed", 1.0, r.getLength(), 0.0);
	}
	
	@Test
	public void testPb_02_05() {
		RoomDimension r = new RoomDimension();
		assertEquals("Test 02_05 failed", 1.0, r.getWidth(), 0.0);
	}
	
	@Test
	public void testPb_02_06() {
		RoomDimension r = new RoomDimension(5.0, 5.0);
		assertEquals("Test 02_06 failed", 5.0, r.getLength(), 0.0);
	}
	
	@Test
	public void testPb_02_07() {
		RoomDimension r = new RoomDimension(5.0, 5.0);
		assertEquals("Test 02_07 failed", 5.0, r.getWidth(), 0.0);
	}
	
	@Test
	public void testPb_02_08() {
		RoomDimension r = new RoomDimension(0.0, 5.0);
		assertEquals("Test 02_08 failed", 1.0, r.getLength(), 0.0);
	}
	
	@Test
	public void testPb_02_09() {
		RoomDimension r = new RoomDimension(5.0, 0.0);
		assertEquals("Test 02_09 failed", 1.0, r.getWidth(), 0.0);
	}
	
	@Test
	public void testPb_02_10() {
		RoomDimension r = new RoomDimension();
		r.setLength(0);
		assertEquals("Test 02_10 failed", 1.0, r.getLength(), 0.0);
	}
	
	@Test
	public void testPb_02_11() {
		RoomDimension r = new RoomDimension();
		r.setLength(10.0);
		assertEquals("Test 02_11 failed", 10.0, r.getLength(), 0.0);
	}
	
	@Test
	public void testPb_02_12() {
		RoomDimension r = new RoomDimension();
		r.setWidth(0);
		assertEquals("Test 02_12 failed", 1.0, r.getWidth(), 0.0);
	}
	
	@Test
	public void testPb_02_13() {
		RoomDimension r = new RoomDimension();
		r.setWidth(10.0);
		assertEquals("Test 02_13 failed", 10.0, r.getWidth(), 0.0);
	}
	
	@Test
	public void testPb_02_14() {
		RoomDimension r = new RoomDimension(0.0, 10.0);
		assertEquals("Test 02_14 failed", 10.0, r.getArea(), 0.0);
	}
	
	@Test
	public void testPb_02_15() {
		RoomDimension r = new RoomDimension(10.0, 10.0);
		assertEquals("Test 02_15 failed", 100.0, r.getArea(), 0.0);
	}
	
	@Test
	public void testPb_02_16() {
		RoomDimension r = new RoomDimension(10.0, 0.0);
		assertEquals("Test 02_16 failed", 10.0, r.getArea(), 0.0);
	}
	
	@Test
	public void testPb_02_17() {
		RoomDimension r = new RoomDimension();
		r.setLength(11.5);
		r.setWidth(r.getLength() + r.getArea());
		assertEquals("Test 02_17 failed", "Length: 11.5, Width: 23.0", r.toString());
	}
	
	@Test
	public void testPb_02_18() {
		RoomDimension r = new RoomDimension();
		RoomDimension s = new RoomDimension(1.1, 1.0);
		assertEquals("Test 02_18 failed", false, r.equals(s));
	}
	
	@Test
	public void testPb_02_19() {
		RoomDimension r = new RoomDimension();
		RoomDimension s = new RoomDimension(1.0, 1.0);
		assertEquals("Test 02_19 failed", true, r.equals(s));
	}
	
	@Test
	public void testPb_02_20() {
		Fan f = new Fan(Fan.SLOW, Fan.ON, 4.7, "white");
		RoomDimension r = new RoomDimension(3.0, 4.0);
		assertEquals("Test 02_20 failed", false, f.isSuitable(r.getArea()));
	}
	
	@Test
	public void testPb_02_21() {
		Fan f = new Fan(Fan.SLOW, Fan.ON, 4.8, "white");
		RoomDimension r = new RoomDimension(3.0, 4.0);
		assertEquals("Test 02_21 failed", true, f.isSuitable(r.getArea()));
	}
	
	@Test
	public void testPb_02_22() {
		Fan f = new Fan(Fan.SLOW, Fan.ON, 6.8, "white");
		RoomDimension r = new RoomDimension(3.0, 4.0);
		assertEquals("Test 02_22 failed", true, f.isSuitable(r.getArea()));
	}
	
	@Test
	public void testPb_02_23() {
		Fan f = new Fan(Fan.SLOW, Fan.ON, 8.0, "white");
		RoomDimension r = new RoomDimension(3.0, 4.0);
		assertEquals("Test 02_23 failed", true, f.isSuitable(r.getArea()));
	}
	
	@Test
	public void testPb_02_24() {
		Fan f = new Fan(Fan.SLOW, Fan.ON, 8.1, "white");
		RoomDimension r = new RoomDimension(3.0, 4.0);
		assertEquals("Test 02_24 failed", false, f.isSuitable(r.getArea()));
	}
	
// TEST CASES FOR HOUSECARPET OBJECT
	
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
		assertEquals("Test 03_04 failed", 1, h.isFanSuitable(new Fan(Fan.FAST, Fan.ON, 15.0, "red")));
	}
	
	@Test
	public void testPb_03_05() {
		HouseCarpet h = new HouseCarpet();
		assertEquals("Test 03_05 failed", 0.0, h.getCarpetCost(), 0.0);
	}
	
	@Test
	public void testPb_03_06() {
		HouseCarpet h = new HouseCarpet();
		assertEquals("Test 03_06 failed", 0, h.getRooms().length, 0.0);
	}
	
	@Test
	public void testPb_03_07() {
		HouseCarpet h = new HouseCarpet();
		h.setCost(10.0);
		assertEquals("Test 03_07 failed", 10.0, h.getCost(), 0.0);
	}
	
	@Test
	public void testPb_03_08() {
		HouseCarpet h = new HouseCarpet();
		h.setCost(-0.1);
		assertEquals("Test 03_00 failed", 0.0, h.getCost(), 0.0);
	}
	
	@Test
	public void testPb_03_09() {
		// instantiating HouseCarpet object with 3 rooms
		HouseCarpet h = new HouseCarpet(3, 10.0);
		// instantiating 3 RoomDimension objects
		RoomDimension r1 = new RoomDimension(11.0, 13.0);
		RoomDimension r2 = new RoomDimension(4.5, 6.2);
		RoomDimension r3 = new RoomDimension(7.5, 7.5);
		// adding RoomDimension objects into RoomDimension Array object
		RoomDimension [] rooms = {r1, r2, r3};
		// passing above Array object to method as argument
		h.setRooms(rooms);
		/* looping for assertions, since unsure how to retrieve RoomDimension objects 
		 * to compare for assertion check, so instead will check room dimensions
		 */
		for (int i = 0; i < h.getRooms().length; i++) {
			// checking Array object RoomDimension objects vs. RoomDimension objects in HouseCarpet object rooms attribute
			assertEquals("Test 03_09 failed", rooms[i].getLength(), h.getRooms()[i].getLength(), 0.0);
			assertEquals("Test 03_09 failed", rooms[i].getWidth(), h.getRooms()[i].getWidth(), 0.0);
		}
	}
	
	@Test
	public void testPb_03_10() {
		HouseCarpet h = new HouseCarpet(3, 10.0);
		/* rather than instantiating RoomDimension objects on separate lines, doing it within
		 * assignment for Array object
		 */
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h.setRooms(rooms);
		for (int i = 0; i < h.getRooms().length; i++) {
			assertEquals("Test 03_10 failed", rooms[i].getLength(), h.getRooms()[i].getLength(), 0.0);
			assertEquals("Test 03_10 failed", rooms[i].getWidth(), h.getRooms()[i].getWidth(), 0.0);
		}
	}
	
	@Test
	public void testPb_03_11() {
		HouseCarpet h = new HouseCarpet(5, 10.0);
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h.setRooms(rooms);
		for (int i = 0; i < h.getRooms().length; i++) {
			assertEquals("Test 03_11 failed", rooms[i].getLength(), h.getRooms()[i].getLength(), 0.0);
			assertEquals("Test 03_11 failed", rooms[i].getWidth(), h.getRooms()[i].getWidth(), 0.0);
		}
	}
	
	@Test
	public void testPb_03_12() {
		HouseCarpet h = new HouseCarpet(5, 10.0);
		RoomDimension [] rooms = {};
		h.setRooms(rooms);
		for (int i = 0; i < h.getRooms().length; i++) {
			assertEquals("Test 03_12 failed", rooms[i].getLength(), h.getRooms()[i].getLength(), 0.0);
			assertEquals("Test 03_12 failed", rooms[i].getWidth(), h.getRooms()[i].getWidth(), 0.0);
		}
	}
	
	@Test
	public void testPb_03_13() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h.setRooms(rooms);
		for (int i = 0; i < h.getRooms().length; i++) {
			assertEquals("Test 03_13 failed", rooms[i].getLength(), h.getRooms()[i].getLength(), 0.0);
			assertEquals("Test 03_13 failed", rooms[i].getWidth(), h.getRooms()[i].getWidth(), 0.0);
		}
	}
	
	@Test
	public void testPb_03_14() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		RoomDimension [] rooms = {new RoomDimension(12.0, 19.0), new RoomDimension(7.0, 1.0), 
				new RoomDimension(5.0, 11.0), new RoomDimension(9.0, 14.0)};
		h.setRooms(rooms);
		String result = Arrays.toString(h.getRoomCosts());
		double [] roomCosts = {2280.0, 70.0, 550.0, 1260.0};
		String expected = Arrays.toString(roomCosts);
		assertEquals("Test 03_14 failed", result, expected);
	}
	
	@Test
	public void testPb_03_15() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		String result = Arrays.toString(h.getRoomCosts());
		double [] roomCosts = {};
		String expected = Arrays.toString(roomCosts);
		assertEquals("Test 03_15 failed", result, expected);
	}
	
	@Test
	public void testPb_03_16() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h.setRooms(rooms);
		assertEquals("Test 03_16 failed", 4275.2, h.getCarpetCost(), 0.0);
	}
	
	@Test
	public void testPb_03_17() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		assertEquals("Test 03_17 failed", 0.0, h.getCarpetCost(), 0.0);
	}
	
	@Test
	public void testPb_03_18() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h.setRooms(rooms);
		assertEquals("Test 03_18 failed", 427.52, h.getTotalArea(), 0.0);
	}
	
	@Test
	public void testPb_03_19() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		assertEquals("Test 03_19 failed", 0.0, h.getTotalArea(), 0.0);
	}
	
	@Test
	public void testPb_03_20() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		RoomDimension [] rooms = {new RoomDimension(2.0, 3.0), new RoomDimension(2.0, 4.0), 
				new RoomDimension(3.0, 5.0), new RoomDimension(4.0, 5.0)};
		h.setRooms(rooms);
		Fan f0 = new Fan(Fan.FAST, Fan.ON, 2.5, "black"); // 1
		Fan f1 = new Fan(Fan.SLOW, Fan.ON, 3.2, "grey"); // 2
		Fan f2 = new Fan(Fan.MEDIUM, Fan.ON, 6.0, "beige"); // 1
		Fan f3 = new Fan(Fan.SLOW, Fan.ON, 10.0, "white"); // 2
		Fan f4 = new Fan(Fan.MEDIUM, Fan.ON, 10000.0, "onyx");
		assertEquals("Test 03_20 failed", 1, h.isFanSuitable(f0), 0.0);
		assertEquals("Test 03_20 failed", 2, h.isFanSuitable(f1), 0.0);
		assertEquals("Test 03_20 failed", 1, h.isFanSuitable(f2), 0.0);
		assertEquals("Test 03_20 failed", 2, h.isFanSuitable(f3), 0.0);
		assertEquals("Test 03_20 failed", 0, h.isFanSuitable(f4), 0.0);
	}
	
	@Test
	public void testPb_03_21() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		Fan f0 = new Fan(Fan.FAST, Fan.ON, 2.5, "black"); // 0
		Fan f1 = new Fan(Fan.SLOW, Fan.ON, 3.2, "grey"); // 0
		Fan f2 = new Fan(Fan.MEDIUM, Fan.ON, 6.0, "beige"); // 0
		Fan f3 = new Fan(Fan.SLOW, Fan.ON, 10.0, "white"); // 0
		Fan f4 = new Fan(Fan.MEDIUM, Fan.ON, 10000.0, "onyx");
		assertEquals("Test 03_21 failed", 0, h.isFanSuitable(f0), 0.0);
		assertEquals("Test 03_21 failed", 0, h.isFanSuitable(f1), 0.0);
		assertEquals("Test 03_21 failed", 0, h.isFanSuitable(f2), 0.0);
		assertEquals("Test 03_21 failed", 0, h.isFanSuitable(f3), 0.0);
		assertEquals("Test 03_21 failed", 0, h.isFanSuitable(f4), 0.0);
	}
	
	@Test
	public void testPb_03_22() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		RoomDimension [] rooms = {new RoomDimension(2.0, 3.0), new RoomDimension(2.0, 4.0), 
				new RoomDimension(3.0, 5.0), new RoomDimension(4.0, 5.0)};
		h.setRooms(rooms);
		String expect = "Total Rooms: 4, Total Area: 49.0, Total Carpet Cost: 490.0";
		String result = h.toString();
		assertEquals("Test 03_22 failed", expect, result);
	}
	
	@Test
	public void testPb_03_23() {
		HouseCarpet h = new HouseCarpet(4, 10.0);
		String expect = "Total Rooms: 4, Total Area: 4.0, Total Carpet Cost: 40.0";
		String result = h.toString();
		assertEquals("Test 03_23 failed", expect, result);
	}
	
	@Test
	public void testPb_03_24() {
		HouseCarpet h = new HouseCarpet(0, 10.0);
		String expect = "Total Rooms: 0, Total Area: 0.0, Total Carpet Cost: 0.0";
		String result = h.toString();
		assertEquals("Test 03_24 failed", expect, result);
	}
	
	@Test
	public void testPb_03_25() {
		HouseCarpet h1 = new HouseCarpet(5, 10.0);
		HouseCarpet h2 = new HouseCarpet(5, 15.0);
		RoomDimension [] rooms = {new RoomDimension(12.1, 19.2), new RoomDimension(7.6, 1.1), 
				new RoomDimension(5.4, 11.1), new RoomDimension(9.0, 14.1)};
		h1.setRooms(rooms);
		h2.setRooms(rooms);
		h1.getRooms()[0] = new RoomDimension();
		assertEquals("failed", h1.getRooms()[0].getLength(), h2.getRooms()[0].getLength(), 0.0);
	}
}