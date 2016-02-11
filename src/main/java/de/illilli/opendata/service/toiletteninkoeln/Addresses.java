package de.illilli.opendata.service.toiletteninkoeln;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Addresses {

	@JacksonXmlElementWrapper(useWrapping = false)
	public List<Address> address;

}
