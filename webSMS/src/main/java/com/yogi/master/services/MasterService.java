/**
 * Apr 19, 2016
 */
package com.yogi.master.services;

import java.util.ArrayList;
import java.util.List;

import com.yogi.master.models.Country;

/**
 * @author y.somvanshi
 *
 */
public interface MasterService {

	public List<Country> getCountries();
	public Country getCountry(int id);
	public boolean addCountry(Country c);
	public boolean updateCountry(Country c);
	public boolean deleteCountry(Country c);
	
}
