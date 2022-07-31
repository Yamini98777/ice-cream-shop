package com.cg.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.shop.entity.IceCream;

@Repository
public interface IIceCreamRepo extends JpaRepository<IceCream, Integer> {

}
