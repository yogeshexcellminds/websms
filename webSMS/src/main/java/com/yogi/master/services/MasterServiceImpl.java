/**
 * Apr 19, 2016
 */
package com.yogi.master.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogi.master.DAO.MasterDAO;
import com.yogi.master.models.Country;

/**
 * @author y.somvanshi
 *
 */
@Service
public class MasterServiceImpl implements MasterService {

	@Autowired
	MasterDAO masterDao;
	/* (non-Javadoc)
	 * @see com.yogi.master.services.MasterService#getCountries()
	 */
	public ArrayList<Country> getCountries() {
		// TODO Auto-generated method stub
		
		return masterDao.getCountries();
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.services.MasterService#getCountry(int)
	 */
	public Country getCountry(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.services.MasterService#addCountry(com.yogi.master.models.Country)
	 */
	public boolean addCountry(Country c) {
		// TODO Auto-generated method stub
		return masterDao.addCountry(c);
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.services.MasterService#updateCountry(com.yogi.master.models.Country)
	 */
	public boolean updateCountry(Country c) {
		// TODO Auto-generated method stub
		return masterDao.updateCountry(c);
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.services.MasterService#deleteCountry(com.yogi.master.models.Country)
	 */
	public boolean deleteCountry(Country c) {
		// TODO Auto-generated method stub
		return masterDao.deleteCountry(c);
	}

}
