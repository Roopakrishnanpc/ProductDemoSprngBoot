package com.ProductManagement.ProductDemoMaven.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ProductManagement.ProductDemoMaven.Entity.Product;
@Repository
public interface ProductDB extends JpaRepository<Product,Integer>{
//@Query
public List<Product> findAllByName(String name);
}
