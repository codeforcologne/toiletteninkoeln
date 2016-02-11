package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.illilli.opendata.service.AskFor;

public class AskForAddressesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumberOfAddress() throws MalformedURLException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/addresses-20160205.xml");
		AskFor<Addresses> askFor = new AskForAddresses(inputStream);
		int expected = 85;
		int actual = askFor.getData().address.size();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testFirstAddress() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/addresses-20160205.xml");
		AskFor<Addresses> askFor = new AskForAddresses(inputStream);
		Address expected = getTestAddress();
		Address actual = askFor.getData().address.get(0);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testOneAddress() throws JsonParseException, JsonMappingException, IOException {
		int expected = 1005483;
		int actual = getTestAddress().uid;
		Assert.assertEquals(expected, actual);
	}

	Address getTestAddress() throws JsonParseException, JsonMappingException, IOException {
		InputStream inputStream = this.getClass().getResourceAsStream("/address-1005483.xml");
		XmlMapper mapper = new XmlMapper();
		Address address = mapper.readValue(inputStream, Address.class);
		return address;
	}

}
