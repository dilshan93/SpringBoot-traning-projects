package com.dilshan.rentcloud.rentservice.model;

import com.dilshan.rentcloud.model.rent.Rent;

/**
 * @author dilshanboteju
 */
public class SimpleResponse implements Response{

    Rent rent;

    public SimpleResponse(Rent rent) {
        this.rent = rent;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
