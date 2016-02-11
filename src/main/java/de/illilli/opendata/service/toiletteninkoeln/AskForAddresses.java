package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;

public class AskForAddresses implements AskFor<Addresses> {

	private static final Logger logger = Logger.getLogger(AskForAddresses.class);

	private String url = Config.getProperty("www.awbkoeln.de");
	private Addresses addresses;
	private InputStream inputStream;

	public AskForAddresses() throws MalformedURLException, IOException {
		this.inputStream = new URL(url).openStream();
		mapData();
	}

	private void mapData() {
		XmlMapper mapper = new XmlMapper();
		try {
			String str = IOUtils.toString(inputStream);
			addresses = mapper.readValue(str, Addresses.class);
		} catch (IOException e) {
			logger.error(e);
		}

	}

	public AskForAddresses(InputStream inputStream) {
		this.inputStream = inputStream;
		mapData();
	}

	@Override
	public Addresses getData() {
		return addresses;
	}

}
