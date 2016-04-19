/**
 * Apr 19, 2016
 */
package com.yogi.master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yogi.master.models.Country;

/**
 * @author y.somvanshi
 *
 */
@Repository
public class MasterDAOImpl implements MasterDAO {

	@Autowired
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	/* (non-Javadoc)
	 * @see com.yogi.master.DAO.MasterDAO#getCountries()
	 */
	public ArrayList<Country> getCountries() {
		// TODO Auto-generated method stub
		String query="select * from country";
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Country> countries=new ArrayList<Country>();
        try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs=ps.executeQuery();
			 while(rs.next()){
				 countries.add(new Country(rs.getInt("id"), rs.getString("name"))); 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
		System.out.println(" countries "+countries.size());
		return countries;
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.DAO.MasterDAO#getCountry(int)
	 */
	public Country getCountry(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.DAO.MasterDAO#addCountry(com.yogi.master.models.Country)
	 */
	public boolean addCountry(Country c) {
		// TODO Auto-generated method stub
		
		String query="Insert into country (name) values (?)";
		Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);	
			ps.setString(1,c.getName());
			result=ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.yogi.master.DAO.MasterDAO#updateCountry(com.yogi.master.models.Country)
	 */
	public boolean updateCountry(Country c) {
		// TODO Auto-generated method stub
		//UPDATE `taskmanager`.`country` SET `name`='hiha 1' WHERE `id`='7';
		String query="UPDATE country set name=? where id=?";
		Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1,c.getName());
			ps.setInt(2,c.getId());
			result=ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/* (non-Javadoc)
	 * @see com.yogi.master.DAO.MasterDAO#deleteCountry(com.yogi.master.models.Country)
	 */
	public boolean deleteCountry(Country c) {
		// TODO Auto-generated method stub
		 
		String query="DELETE FROM country  where id=?";
		Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			
			ps.setInt(1,c.getId());
			result=ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
