package com.ankita.project.service;

import com.ankita.project.entity.Customer;

import java.util.List;

public interface service {

    List<Customer> findAll();

    Customer findById(Integer id);

    void save(Customer customer);

    void delete(Integer id);

}