package de.illilli.opendata.service.toiletteninkoeln;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;

public class AllToilettesJsonFacade implements Facade {

	private AskFor<Addresses> askFor;

	public AllToilettesJsonFacade() throws MalformedURLException, IOException {
		this.askFor = new AskForAddresses();
	}

	public AllToilettesJsonFacade(InputStream inputStream) throws MalformedURLException, IOException {
		this.askFor = new AskForAddresses(inputStream);
	}

	@Override
	public String getJson() throws JsonProcessingException {
		List<AddressBo> addressList = new AddressDao(this.askFor.getData()).getAddressList();
		Gson gson = new GsonBuilder().create();
		return gson.toJson(addressList);
	}

}
