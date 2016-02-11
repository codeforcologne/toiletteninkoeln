package de.illilli.opendata.service.toiletteninkoeln;

/**
 * <ol>
 * <li>Barrierefrei (z.T. eingeschränkt)</li>
 * <li>24h geöffnet</li>
 * <li>Baby-Wickeltisch</li>
 * <li>Urinal</li>
 * <li>City-Toilette</li>
 * <li>Toilette in öffentlichen Einrichtungen</li>
 * <li>HappyToilet Köln</li>
 * <li>Toilette in Grünanlagen</li>
 * <li></li>
 * <li></li>
 * <li>Kostenlos</li>
 * </ol>
 * 
 * @author wolfram
 *
 */
public enum InfrastructureEnum {

	barrierefrei("Barrierefrei (z.T. eingeschränkt)"), h24geoeffnet("24h geöffnet"), babywickeltisch(
			"Baby-Wickeltisch"), urinal("Urinal"), citytoilet("City-Toilette"), oefftoilet(
					"Toilette in öffentlichen Einrichtungen"), happytoilet("HappyToilet Köln"), gruentoilet(
							"Toilette in Grünanlagen"), empty9("Kostenpflichtig"), empty10(
									"Euro WC-Schlüssel"), kostenlos("Kostenlos");

	private String value;

	InfrastructureEnum(String value) {
		this.value = value;
	}

	InfrastructureEnum() {

	}

	public String getValue() {
		return this.value;
	}

	public static String getValueByKey(int key) {
		switch (key) {
		case 1:
			return barrierefrei.getValue();
		case 2:
			return h24geoeffnet.getValue();
		case 3:
			return babywickeltisch.getValue();
		case 4:
			return urinal.getValue();
		case 5:
			return citytoilet.getValue();
		case 6:
			return oefftoilet.getValue();
		case 7:
			return happytoilet.getValue();
		case 8:
			return gruentoilet.getValue();
		case 9:
			return empty9.getValue();
		case 10:
			return empty10.getValue();
		case 11:
			return kostenlos.getValue();
		default:
			return "";
		}
	}

}
