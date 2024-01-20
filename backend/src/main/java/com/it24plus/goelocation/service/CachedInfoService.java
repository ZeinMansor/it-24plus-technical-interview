package com.it24plus.goelocation.service;


import com.it24plus.goelocation.model.AddressInformation;
import com.it24plus.goelocation.repository.AddressInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachedInfoService {

    private AddressInfoRepository repository;
    public CachedInfoService(AddressInfoRepository _repository) {
        this.repository = _repository;
    }

    /**
     * @apiNote get all search log with query title like queryTitle
     *
     * @param queryTitle
     * @return
     */
    public List<AddressInformation> getCachedInformation(String queryTitle) {
        return repository.findAllByTitle(queryTitle);
    }

}
