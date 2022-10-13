package com.ct414a1a.ug;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class UsernameTest {

	@Test
	public void test() {
		
		assertEquals(new Student("John Marnane", new DateTime(2000, 6, 30, 0,0), 19379026).getUsername(), "JohnMarnane22");
		assertEquals(new Lecturer("Jim Marnane", new DateTime(1970, 2, 6, 0, 0), 00011122).getUsername(), "JimMarnane52");
		
		System.out.println(new Student("John Marnane", new DateTime(2000, 6, 30, 0,0), 19379026).getUsername());
		System.out.println(new Lecturer("Jim Marnane", new DateTime(1970, 2, 6, 0, 0), 00011122).getUsername());
		
	}

}
