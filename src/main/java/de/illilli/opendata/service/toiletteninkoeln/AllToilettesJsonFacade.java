package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;

public class AllToilettesJsonFacade implements Facade {

	private List<AddressBo> addressBoList = new ArrayList<AddressBo>();
	private Addresses addresses;

	public AllToilettesJsonFacade() throws MalformedURLException, IOException {
		AskFor<Addresses> askFor = new AskForAddresses();
		addresses = askFor.getData();
	}

	public AllToilettesJsonFacade(InputStream inputStream) throws MalformedURLException, IOException {
		AskFor<Addresses> askFor = new AskForAddresses(inputStream);
		addresses = askFor.getData();
	}

	@Override
	public String getJson() throws JsonProcessingException {

		for (Address address : addresses.address) {
			addressBoList.add(new AddressBo(address));
		}
		Gson gson = new GsonBuilder().create();
		return gson.toJson(addressBoList);
	}

}
