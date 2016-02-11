package de.illilli.opendata.service.toiletteninkoeln;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * <pre>
 *       "uid": "1005483",
        "type": "HappyToilet Köln",
        "name": "Biergarten Rathenauplatz",
        "street": "Rathenauplatz",
        "area": "Neustadt-Süd",
        "zipcode": "50674",
        "city": "Köln",
        "coordinates": "50.931407,6.935809",
        "phone": "Startdaten",
        "cardname": "Biergarten Rathenauplatz",
        "cardnamegb": "Biergarten Rathenauplatz",
        "district": "Ehrenfeld",
        "description": "Nutzungsbebühr: Kostenlos;Ein Trinkgeld ist freiwillig.; ",
        "descriptiongb": "Usage Fee: free of charge; Tips are voluntary.; ",
        "opening": "Geöffnet in der Sommersaison von April bis September bei schönem Wetter.",
        "openinggb": "Opened during summer season from April to September when the weather is nice.",
        "start": "2015-04-01",
        "stop": "2015-09-30",
        "infrastructure": "3,4,7,11"
 * 
 * </pre>
 * 
 * @author wolfram
 *
 */
@JacksonXmlRootElement(localName = "address")
public class Address {

	public int uid;
	public String type;
	public String name;
	public String street;
	public String area;
	public int zipcode;
	public String city;
	public String coordinates;
	public String phone;
	public String cardname;
	public String cardnamegb;
	public String district;
	public String description;
	public String descriptiongb;
	public String opening;
	public String openinggb;
	public String start;
	public String stop;
	public String image;
	public String infrastructure;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cardname == null) ? 0 : cardname.hashCode());
		result = prime * result + ((cardnamegb == null) ? 0 : cardnamegb.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((coordinates == null) ? 0 : coordinates.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((descriptiongb == null) ? 0 : descriptiongb.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((infrastructure == null) ? 0 : infrastructure.hashCode());
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
		Address other = (Address) obj;
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
		if (coordinates == null) {
			if (other.coordinates != null)
				return false;
		} else if (!coordinates.equals(other.coordinates))
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
		if (infrastructure == null) {
			if (other.infrastructure != null)
				return false;
		} else if (!infrastructure.equals(other.infrastructure))
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
		return "Address [uid=" + uid + ", type=" + type + ", name=" + name + ", street=" + street + ", area=" + area
				+ ", zipcode=" + zipcode + ", city=" + city + ", coordinates=" + coordinates + ", phone=" + phone
				+ ", cardname=" + cardname + ", cardnamegb=" + cardnamegb + ", district=" + district + ", description="
				+ description + ", descriptiongb=" + descriptiongb + ", opening=" + opening + ", openinggb=" + openinggb
				+ ", start=" + start + ", stop=" + stop + ", image=" + image + ", infrastructure=" + infrastructure
				+ "]";
	}

}
