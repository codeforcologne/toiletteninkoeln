package de.illilli.opendata.service.toiletteninkoeln;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InfrastructureMapperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetMapForKostenlos() {
		String infrastructure = "11";
		InfrastructureMapper mapper = new InfrastructureMapper(infrastructure);
		Map<String, String> map = mapper.getMap();
		String expected = InfrastructureEnum.kostenlos.getValue();
		String actual = map.get(infrastructure);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetMapFor1_2_3_4_5() {
		String infrastructure = "1,2,3,4,5";
		InfrastructureMapper mapper = new InfrastructureMapper(infrastructure);
		Map<String, String> map = mapper.getMap();
		int expected = 5;
		int actual = map.size();
		Assert.assertEquals(expected, actual);
	}

}
