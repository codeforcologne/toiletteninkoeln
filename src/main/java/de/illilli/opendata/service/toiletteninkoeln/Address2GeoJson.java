package de.illilli.opendata.service.toiletteninkoeln;

import java.util.Hashtable;
import java.util.Map;

import org.geojson.GeoJsonObject;
import org.geojson.LngLatAlt;
import org.geojson.Point;

import de.illilli.opendata.service.GeoJson;

/**
 * This class changes a Address-Object to GeoJson-Object, to use in a
 * FeatureCollection. All conversion is made here; none in the facade
 * implementation.
 */
public class Address2GeoJson {

	private GeoJson addressGeoJson;

	public Address2GeoJson(Address address) {

		String id = Integer.toString(address.uid);

		LngLatAlt coordinate = new LngLatAlt();
		coordinate.setLatitude(new CoordinatsParser(address.coordinates).getLat());
		coordinate.setLongitude(new CoordinatsParser(address.coordinates).getLng());
		GeoJsonObject geometry = new Point(coordinate);

		Map<String, Object> properties = new Hashtable<String, Object>();
		properties.put("zipcode", address.zipcode);
		properties.put("city", address.city);
		properties.put("street", address.street);
		properties.put("type", address.type);
		properties.put("name", address.name);
		properties.put("area", address.area);
		properties.put("phone", address.phone == null ? "" : address.phone);
		properties.put("cardname", address.cardname);
		properties.put("cardnamegb", address.cardnamegb);
		properties.put("district", address.district == null ? "" : address.district);
		properties.put("description", address.description);
		properties.put("descriptiongb", address.descriptiongb);
		properties.put("opening", address.opening);
		properties.put("openinggb", address.openinggb);
		properties.put("start", address.start == null ? "" : address.start);
		properties.put("stop", address.stop == null ? "" : address.stop);
		properties.put("image", address.image == null ? "" : address.image);
		Map<String, String> infrastructureMap = new InfrastructureMapper(address.infrastructure).getMap();
		properties.put("infrastructure", infrastructureMap);

		addressGeoJson = new AddressGeoJson(id, properties, geometry);

		InfrastructureEnum.babywickeltisch.getValue();
		InfrastructureEnum.getValueByKey(1);
	}

	public GeoJson getGeoJsonObject() {
		return addressGeoJson;
	}

}
