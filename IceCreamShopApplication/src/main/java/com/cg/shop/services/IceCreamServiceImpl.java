package com.cg.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.shop.entity.IceCream;
import com.cg.shop.exceptions.IceCreamNotFoundException;
import com.cg.shop.repository.IIceCreamRepo;

@Service
public class IceCreamServiceImpl implements IIceCreamService {
	
	@Autowired
	private IIceCreamRepo iceCreamRepo;

	@Override
	public IceCream addIceCream(IceCream iceCream) {
		
		return iceCreamRepo.save(iceCream);
	}

	@Override
	public IceCream deleteIceCream(int flavourCode) throws IceCreamNotFoundException {
		
		IceCream existIceCream = iceCreamRepo.findById(flavourCode).orElse(null);

		if (existIceCream == null)
			throw new IceCreamNotFoundException("No ice cream found with given flavor code");
		else
			iceCreamRepo.delete(existIceCream);
		return existIceCream;
		
	}

	@Override
	public IceCream getIceCream(int flavourCode) throws IceCreamNotFoundException {

		IceCream existIceCream = iceCreamRepo.findById(flavourCode).orElse(null);

		if (existIceCream == null)
			throw new IceCreamNotFoundException("No ice cream found with given flavor code");

		return existIceCream;

	}

	@Override
	public List<IceCream> getAllIceCreams() {
		
		return iceCreamRepo.findAll();
	}

	@Override
	public IceCream updateIceCream(int flavourCode, IceCream iceCream) throws IceCreamNotFoundException {
		
		IceCream existIceCream = iceCreamRepo.findById(flavourCode).orElse(null);

		if (existIceCream == null)
			throw new IceCreamNotFoundException("No ice cream found with given flavor code");
		
		return iceCreamRepo.save(iceCream);
	}

}
