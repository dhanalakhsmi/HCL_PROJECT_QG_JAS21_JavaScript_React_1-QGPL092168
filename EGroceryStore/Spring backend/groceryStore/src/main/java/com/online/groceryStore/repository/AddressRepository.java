package com.online.groceryStore.repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.groceryStore.model.Address;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
}
