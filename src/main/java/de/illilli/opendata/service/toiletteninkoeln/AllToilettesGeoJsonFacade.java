package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.geojson.Feature;
import org.geojson.FeatureCollection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Config;
import de.illilli.opendata.service.Facade;
import de.illilli.opendata.service.GeoJson;

public class AllToilettesGeoJsonFacade implements Facade {

	private FeatureCollection featureCollection = new FeatureCollection();
	final static String DATEFORMAT = Config.getProperty("dateformat");

	public AllToilettesGeoJsonFacade() throws MalformedURLException, IOException {
		AskFor<Addresses> askFor = new AskForAddresses();
		List<AddressBo> addressList = new AddressDao(askFor.getData()).getAddressList();

		for (AddressBo address : addressList) {
			GeoJson gjo = new Address2GeoJson(address).getGeoJsonObject();
			Feature feature = new Feature();
			feature.setGeometry(gjo.getGeometry());
			feature.setId(gjo.getId());
			feature.setProperties(gjo.getProperties());
			featureCollection.add(feature);
		}
	}

	@Override
	public String getJson() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(featureCollection);
	}

}
