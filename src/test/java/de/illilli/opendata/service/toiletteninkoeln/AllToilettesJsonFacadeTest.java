package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.illilli.opendata.service.Facade;

public class AllToilettesJsonFacadeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws MalformedURLException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/addresses-20160205.xml");
		Facade facade = new AllToilettesJsonFacade(inputStream);
		InputStream expectedInputStream = this.getClass().getResourceAsStream("/addresses-20160205.json");
		String expected = IOUtils.toString(expectedInputStream);
		String actual = facade.getJson();
		Assert.assertEquals(expected, actual);
	}

}
