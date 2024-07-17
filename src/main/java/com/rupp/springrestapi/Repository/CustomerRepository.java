package com.rupp.springrestapi.Repository;

import com.rupp.springrestapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
