package de.illilli.opendata.service.toiletteninkoeln;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class InfrastructureMapper {

	public static final String DELIM = ",";
	private Map<String, String> infrastructureMap;

	public InfrastructureMapper(String infrastructure) {
		infrastructureMap = new HashMap<String, String>();

		if (infrastructure != null && infrastructure.length() > 0) {
			StringTokenizer st = new StringTokenizer(infrastructure, DELIM);
			while (st.hasMoreTokens()) {
				String key = st.nextToken();
				String value = InfrastructureEnum.getValueByKey(Integer.parseInt(key));
				infrastructureMap.put(key, value);
			}
		}
	}

	public Map<String, String> getMap() {
		return infrastructureMap;
	}

}
