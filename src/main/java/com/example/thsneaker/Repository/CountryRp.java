package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRp extends JpaRepository<Country, Long> {
}
