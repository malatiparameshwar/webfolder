package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAOImplementation.CustomerDaoImplementation;
import com.example.demo.Model.CustomerModel;



@RequestMapping("/register")
@Controller
public class RegisterController {
	@Autowired
	 CustomerModel customerModel;
	 CustomerDaoImplementation c1;
	
	 @RequestMapping(method = RequestMethod.POST, value="/register")
	  @ResponseBody
	  public List<CustomerModel> registerStudent(@RequestBody CustomerDaoImplementation customerDaoImplementation) {
	    List<CustomerModel>list= new ArrayList<CustomerModel>();
		 c1.addUser(customerModel);
	     list.add(customerModel);
	        return list; 
	}
	

	@ModelAttribute("country")
	public List<String> getCountries(){
		List<String> country = new ArrayList<String>();
		country.add("India");
		country.add("Australia");
		country.add("UK");
		country.add("US");
		return country;
	}
		
		@ModelAttribute("state")
		public List<String> getStates(){
			List<String> state = new ArrayList<String>();
			state.add("Karnataka");
			state.add("QueensLand");
			state.add("England");
			state.add("California");
			return state;
		}
			
			@ModelAttribute("city")
			public List<String> getCity(){
				List<String> city = new ArrayList<String>();
				city.add("Bangalore");
				city.add("Melbourne");
				city.add("London");
				city.add("Los Angeles");
				return city;
		
	}
}
