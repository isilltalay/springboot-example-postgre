package com.example.postgreexample.repo;

import com.example.postgreexample.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Adres,Long> {
}
