package de.illilli.opendata.service.toiletteninkoeln;

import org.apache.log4j.Logger;

public class CoordinatsParser {

	private static final Logger logger = Logger.getLogger(CoordinatsParser.class);

	private double lat;
	private double lng;

	public CoordinatsParser(String coordinates) {

		if (coordinates.startsWith(",")) {
			coordinates = coordinates.substring(1);
		}

		String[] coordinateArray = coordinates.split(",");
		try {
			lat = Double.parseDouble(coordinateArray[0]);
		} catch (NumberFormatException e) {
			logger.error("lat='" + coordinateArray[0] + "'", e);
		}

		try {
			lng = Double.parseDouble(coordinateArray[1]);
		} catch (NumberFormatException e) {
			logger.error("lat='" + coordinateArray[1] + "'", e);
		}

	}

	public double getLat() {
		return lat;
	}

	public double getLng() {
		return lng;
	}

}
