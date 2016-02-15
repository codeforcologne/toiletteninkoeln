package de.illilli.opendata.service.toiletteninkoeln;

import java.util.Map;

public class AddressBo {

	private int uid;
	private String type;
	private String name;
	private String street;
	private String area;
	private int zipcode;
	private String city;
	private double lat;
	private double lng;
	private String phone;
	private String cardname;
	private String cardnamegb;
	private String district;
	private String description;
	private String descriptiongb;
	private String opening;
	private String openinggb;
	private String start;
	private String stop;
	private String image;
	Map<String, String> infrastructureMap;

	public AddressBo(Address address) {
		this.uid = address.uid;
		this.type = address.type;
		this.name = address.name;
		this.street = address.street;
		this.area = address.area;
		this.zipcode = address.zipcode;
		this.city = address.city;
		this.lat = new CoordinatsParser(address.coordinates).getLat();
		this.lng = new CoordinatsParser(address.coordinates).getLng();
		this.phone = address.phone;
		this.cardname = address.cardname;
		this.cardnamegb = address.cardnamegb;
		this.district = address.district;
		this.description = address.description;
		this.descriptiongb = address.descriptiongb;
		this.opening = address.opening;
		this.openinggb = address.openinggb;
		this.start = address.start;
		this.stop = address.stop;
		this.image = address.image;
		this.infrastructureMap = new InfrastructureMapper(address.infrastructure).getMap();
	}

	public int getUid() {
		return uid;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getArea() {
		return area;
	}

	public int getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public double getLat() {
		return lat;
	}

	public double getLng() {
		return lng;
	}

	public String getPhone() {
		return phone;
	}

	public String getCardname() {
		return cardname;
	}

	public String getCardnamegb() {
		return cardnamegb;
	}

	public String getDistrict() {
		return district;
	}

	public String getDescription() {
		return description;
	}

	public String getDescriptiongb() {
		return descriptiongb;
	}

	public String getOpening() {
		return opening;
	}

	public String getOpeninggb() {
		return openinggb;
	}

	public String getStart() {
		return start;
	}

	public String getStop() {
		return stop;
	}

	public String getImage() {
		return image;
	}

	public Map<String, String> getInfrastructureMap() {
		return infrastructureMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cardname == null) ? 0 : cardname.hashCode());
		result = prime * result + ((cardnamegb == null) ? 0 : cardnamegb.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((descriptiongb == null) ? 0 : descriptiongb.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((infrastructureMap == null) ? 0 : infrastructureMap.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lng);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((opening == null) ? 0 : opening.hashCode());
		result = prime * result + ((openinggb == null) ? 0 : openinggb.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((stop == null) ? 0 : stop.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + uid;
		result = prime * result + zipcode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBo other = (AddressBo) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (cardname == null) {
			if (other.cardname != null)
				return false;
		} else if (!cardname.equals(other.cardname))
			return false;
		if (cardnamegb == null) {
			if (other.cardnamegb != null)
				return false;
		} else if (!cardnamegb.equals(other.cardnamegb))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (descriptiongb == null) {
			if (other.descriptiongb != null)
				return false;
		} else if (!descriptiongb.equals(other.descriptiongb))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (infrastructureMap == null) {
			if (other.infrastructureMap != null)
				return false;
		} else if (!infrastructureMap.equals(other.infrastructureMap))
			return false;
		if (Double.doubleToLongBits(lat) != Double.doubleToLongBits(other.lat))
			return false;
		if (Double.doubleToLongBits(lng) != Double.doubleToLongBits(other.lng))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (opening == null) {
			if (other.opening != null)
				return false;
		} else if (!opening.equals(other.opening))
			return false;
		if (openinggb == null) {
			if (other.openinggb != null)
				return false;
		} else if (!openinggb.equals(other.openinggb))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (stop == null) {
			if (other.stop != null)
				return false;
		} else if (!stop.equals(other.stop))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (uid != other.uid)
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddressBo [uid=" + uid + ", type=" + type + ", name=" + name + ", street=" + street + ", area=" + area
				+ ", zipcode=" + zipcode + ", city=" + city + ", lat=" + lat + ", lng=" + lng + ", phone=" + phone
				+ ", cardname=" + cardname + ", cardnamegb=" + cardnamegb + ", district=" + district + ", description="
				+ description + ", descriptiongb=" + descriptiongb + ", opening=" + opening + ", openinggb=" + openinggb
				+ ", start=" + start + ", stop=" + stop + ", image=" + image + ", infrastructureMap="
				+ infrastructureMap + "]";
	}

}
