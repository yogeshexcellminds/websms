/**
 * Apr 19, 2016
 */
package com.yogi.master.DAO;

import java.util.ArrayList;

import com.yogi.master.models.Country;

/**
 * @author y.somvanshi
 *
 */
public interface MasterDAO {
	public ArrayList<Country> getCountries();
	public Country getCountry(int id);
	public boolean addCountry(Country c);
	public boolean updateCountry(Country c);
	public boolean deleteCountry(Country c);
	
}
