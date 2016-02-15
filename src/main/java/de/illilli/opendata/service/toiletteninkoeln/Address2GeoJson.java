package de.illilli.opendata.service.toiletteninkoeln;

import java.util.Hashtable;
import java.util.Map;

import org.geojson.GeoJsonObject;
import org.geojson.LngLatAlt;
import org.geojson.Point;

import de.illilli.opendata.service.GeoJson;

/**
 * This class changes a AddressBo-Object to GeoJson-Object, to use in a
 * FeatureCollection. All conversion is made here; none in the facade
 * implementation.
 */
public class Address2GeoJson {

	private GeoJson addressGeoJson;

	public Address2GeoJson(AddressBo address) {

		String id = Integer.toString(address.getUid());

		LngLatAlt coordinate = new LngLatAlt();
		coordinate.setLatitude(address.getLat());
		coordinate.setLongitude(address.getLng());
		GeoJsonObject geometry = new Point(coordinate);

		Map<String, Object> properties = new Hashtable<String, Object>();
		properties.put("zipcode", address.getZipcode());
		properties.put("city", address.getCity());
		properties.put("street", address.getStreet());
		properties.put("type", address.getType());
		properties.put("name", address.getName());
		properties.put("area", address.getArea());
		properties.put("phone", address.getPhone() == null ? "" : address.getPhone());
		properties.put("cardname", address.getCardname());
		properties.put("cardnamegb", address.getCardnamegb());
		properties.put("district", address.getDistrict() == null ? "" : address.getDistrict());
		properties.put("description", address.getDescription());
		properties.put("descriptiongb", address.getDescriptiongb());
		properties.put("opening", address.getOpening());
		properties.put("openinggb", address.getOpeninggb());
		properties.put("start", address.getStart() == null ? "" : address.getStart());
		properties.put("stop", address.getStop() == null ? "" : address.getStop());
		properties.put("image", address.getImage() == null ? "" : address.getImage());
		Map<String, String> infrastructureMap = address.getInfrastructureMap();
		properties.put("infrastructure", infrastructureMap);
		addressGeoJson = new AddressGeoJson(id, properties, geometry);
	}

	public GeoJson getGeoJsonObject() {
		return addressGeoJson;
	}

}
