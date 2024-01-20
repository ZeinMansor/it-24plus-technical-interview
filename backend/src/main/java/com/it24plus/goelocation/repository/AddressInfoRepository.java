package com.it24plus.goelocation.repository;

import com.it24plus.goelocation.model.AddressInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressInfoRepository extends JpaRepository<AddressInformation, Long> {
    List<AddressInformation> findAllByTitle(String title);
}
