/**
 * Apr 19, 2016
 */
package com.yogi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yogi.master.models.Country;
import com.yogi.master.services.MasterService;
/**
 * @author y.somvanshi
 *
 */

@Controller
@RequestMapping("/api/master")
public class MasterController {

	@Autowired
	MasterService masterService;
	

	@RequestMapping(value = "/listofcountry", method = RequestMethod.GET)  
    public @ResponseBody List<Country> list() {  
	
	  return masterService.getCountries();  
	  
	 }  
	
	 @RequestMapping(value = "/addCountry", method = RequestMethod.POST)
		public @ResponseBody String addCountry(@RequestBody Country coutry){
			String resultdata="not success";
			System.out.println(" --- "+coutry.toString());
			boolean result= masterService.addCountry(coutry);
			System.out.println( "result "+result);
			if (!result){
				resultdata="success";
			}
			return resultdata;
		}
	 @RequestMapping(value = "/updateCountry", method = RequestMethod.POST)
		public @ResponseBody String updateCountry(@RequestBody Country coutry){
			String resultdata="not success";
			System.out.println(" --- "+coutry.toString());
			boolean result= masterService.updateCountry(coutry);
			System.out.println( "result "+result);
			if (!result){
				resultdata="success";
			}
			return resultdata;
		}
	 
	 @RequestMapping(value = "/deleteCountry", method = RequestMethod.POST)
		public @ResponseBody String deleteCountry(@RequestBody Country coutry){
			String resultdata="not success";
			System.out.println(" --- "+coutry.toString());
			boolean result= masterService.deleteCountry(coutry);
			System.out.println( "result "+result);
			if (!result){
				resultdata="success";
			}
			return resultdata;
		}
}
