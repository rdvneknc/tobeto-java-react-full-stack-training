package com.tobeto.a.spring.intro.entities.repositories;

import com.tobeto.a.spring.intro.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// Generic Type'lar Reference Type olarak belirtilmeli

public interface BrandRepository extends JpaRepository<Customer, Integer>
{

}
