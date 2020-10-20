package com.dilshan.rentcloud.rentprocesstask.services;

import org.springframework.stereotype.Service;

/**
 * @author dilshanboteju
 */
@Service
public class RentProcessServiiceImpl implements RentProcessServiice {

    @Override
    public boolean validationDL(String dlNumber){
        return dlNumber.length()>5;
    }
}
