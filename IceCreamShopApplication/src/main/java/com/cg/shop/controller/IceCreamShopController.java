package com.cg.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.shop.entity.IceCream;
import com.cg.shop.exceptions.IceCreamNotFoundException;
import com.cg.shop.services.IIceCreamService;

@CrossOrigin
@RestController
@RequestMapping("api/ics/controller")
public class IceCreamShopController {

	@Autowired
	private IIceCreamService iceCreamService;
	
	@PostMapping("/add-icecream")
	public ResponseEntity<IceCream> addIceCream(@RequestBody IceCream iceCream) {
		return new ResponseEntity<>(iceCreamService.addIceCream(iceCream), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete-icecream/{flavourCode}")
	public ResponseEntity<IceCream> deleteIceCream(@PathVariable int flavourCode) throws IceCreamNotFoundException {
		return new ResponseEntity<>(iceCreamService.deleteIceCream(flavourCode), HttpStatus.ACCEPTED);
	}

	@GetMapping("/get-icecream/{flavourCode}")
	public ResponseEntity<IceCream> getIceCream(@PathVariable int flavourCode) throws IceCreamNotFoundException {
		return new ResponseEntity<>(iceCreamService.getIceCream(flavourCode), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get-icecream-all")
	public List<IceCream> getAllIceCreams() throws IceCreamNotFoundException {
		return iceCreamService.getAllIceCreams();
	}
	
	@PutMapping("/update-icecream/{flavourCode}")
	public ResponseEntity<IceCream> updateIceCream(@PathVariable int flavourCode, @RequestBody IceCream iceCream) throws IceCreamNotFoundException {
		return  new ResponseEntity<>(iceCreamService.updateIceCream(flavourCode, iceCream), HttpStatus.ACCEPTED);
	}
	
}
