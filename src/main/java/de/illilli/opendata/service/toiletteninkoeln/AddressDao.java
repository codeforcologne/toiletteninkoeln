package de.illilli.opendata.service.toiletteninkoeln;

import java.util.ArrayList;
import java.util.List;

public class AddressDao {

	private List<AddressBo> addressList = new ArrayList<AddressBo>();

	public AddressDao(Addresses addresses) {
		for (Address address : addresses.address) {
			addressList.add(new AddressBo(address));
		}
	}

	public List<AddressBo> getAddressList() {
		return addressList;
	}

}
