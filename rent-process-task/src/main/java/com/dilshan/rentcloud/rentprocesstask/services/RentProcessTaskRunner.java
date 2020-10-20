package com.dilshan.rentcloud.rentprocesstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author dilshanboteju
 */
public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    RentProcessServiice rentProcessServiice;

    @Override
    public void run(String... args) throws Exception {

        if (args.length>0){
            System.out.println("task running with arguments");

            if (rentProcessServiice.validationDL(args[0])){
                System.out.println("Valid driving license");
            }else {
                System.out.println("Invalid driving license");
            }
        }else {
            System.out.println("task running without arguments");
        }
    }
}
