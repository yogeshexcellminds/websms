package com.yogi.controller;
import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.ResponseBody;  
  
import com.yogi.models.User;  
import com.yogi.services.DataService;  

/**
 * @author y.somvanshi
 *
 */

@Controller  
@RequestMapping("/api/users")  
public class RestController {  
  
 @Autowired  
 DataService dataService;  
  
 @RequestMapping(value = "/", method = RequestMethod.GET)  
 @ResponseBody  
 public List<User> list() {  
  return dataService.getUserList();  
  
 }  
}  
  
