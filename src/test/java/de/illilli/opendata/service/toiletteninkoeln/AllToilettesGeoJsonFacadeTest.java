package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;

import de.illilli.opendata.service.Facade;

public class AllToilettesGeoJsonFacadeTest {

	private static final Logger logger = Logger.getLogger(AllToilettesGeoJsonFacadeTest.class);

	public static void main(String[] args) throws MalformedURLException, IOException {
		Facade facade = new AllToilettesGeoJsonFacade();
		logger.info(facade.getJson());
	}

}
