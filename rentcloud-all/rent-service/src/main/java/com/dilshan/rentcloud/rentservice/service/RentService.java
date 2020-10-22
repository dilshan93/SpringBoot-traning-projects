package com.dilshan.rentcloud.rentservice.service;

import com.dilshan.rentcloud.model.rent.Rent;
import com.dilshan.rentcloud.rentservice.model.DetailResponse;
import com.dilshan.rentcloud.rentservice.model.Response;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author dilshanboteju
 */
public interface RentService {
    Rent save(Rent rent);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
