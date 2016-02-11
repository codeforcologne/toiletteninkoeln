package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.geojson.GeoJsonObject;
import org.geojson.Point;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.illilli.opendata.service.GeoJson;

public class Address2GeoJsonTest {

	private static final Logger logger = Logger.getLogger(Address2GeoJsonTest.class);

	static final int UID = 1005483;

	@Test
	public void testUid() {
		Address2GeoJson a2g = new Address2GeoJson(getAddress());
		GeoJson geoJson = a2g.getGeoJsonObject();
		String expected = Integer.toString(UID);
		String actual = geoJson.getId();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGeoJsonObject() {
		Address2GeoJson a2g = new Address2GeoJson(getAddress());
		GeoJson geoJson = a2g.getGeoJsonObject();
		GeoJsonObject expected = new Point(6.935809, 50.931407);
		GeoJsonObject actual = geoJson.getGeometry();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProperties() {
		Address2GeoJson a2g = new Address2GeoJson(getAddress());
		GeoJson geoJson = a2g.getGeoJsonObject();
		String expected = "Rathenauplatz";
		Object actual = geoJson.getProperties().get("street");
		Assert.assertEquals(expected, actual);

	}

	private Address getAddress() {
		InputStream inputStream = this.getClass().getResourceAsStream("/address-1005483.xml");
		XmlMapper mapper = new XmlMapper();
		Address address = new Address();
		try {
			address = mapper.readValue(inputStream, Address.class);
		} catch (JsonParseException e) {
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		return address;
	}

}
