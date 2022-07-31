package com.cg.shop.services;

import java.util.List;

import com.cg.shop.entity.IceCream;
import com.cg.shop.exceptions.IceCreamNotFoundException;

public interface IIceCreamService {

	public IceCream addIceCream(IceCream iceCream);

	public IceCream deleteIceCream(int flavourCode) throws IceCreamNotFoundException;

	public IceCream getIceCream(int flavourCode) throws IceCreamNotFoundException;

	public List<IceCream> getAllIceCreams();

	public IceCream updateIceCream(int flavourCode, IceCream iceCream) throws IceCreamNotFoundException ;
	
}
