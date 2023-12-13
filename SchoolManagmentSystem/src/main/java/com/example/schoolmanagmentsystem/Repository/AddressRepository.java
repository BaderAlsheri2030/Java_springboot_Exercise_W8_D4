package com.example.schoolmanagmentsystem.Repository;

import com.example.schoolmanagmentsystem.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

    Address findAddressById(Integer id);
}
