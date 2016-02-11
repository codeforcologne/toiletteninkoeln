package de.illilli.opendata.service.toiletteninkoeln;

import java.util.Map;

import org.geojson.GeoJsonObject;

import de.illilli.opendata.service.GeoJson;

public class AddressGeoJson implements GeoJson {

	private String id;
	private Map<String, Object> properties;
	private GeoJsonObject geometry;

	public AddressGeoJson(String id, Map<String, Object> properties, GeoJsonObject geometry) {
		this.id = id;
		this.properties = properties;
		this.geometry = geometry;
	}

	public String getId() {
		return id;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public GeoJsonObject getGeometry() {
		return geometry;
	}
}
