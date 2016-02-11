package de.illilli.opendata.service.toiletteninkoeln;

import org.junit.Assert;
import org.junit.Test;

public class CoordinatsParserTest {

	@Test
	public void testLat() {
		String coordinates = "50.931407,6.935809";
		CoordinatsParser parser = new CoordinatsParser(coordinates);
		double expected = 50.931407;
		double actual = parser.getLat();
		double delta = 0.0;
		Assert.assertEquals(expected, actual, delta);
	}

	@Test
	public void testLng() {
		String coordinates = "50.931407,6.935809";
		CoordinatsParser parser = new CoordinatsParser(coordinates);
		double expected = 6.935809;
		double actual = parser.getLng();
		double delta = 0.0;
		Assert.assertEquals(expected, actual, delta);
	}

}
