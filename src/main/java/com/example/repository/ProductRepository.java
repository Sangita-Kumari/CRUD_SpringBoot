package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Products;


public interface ProductRepository extends JpaRepository<Products,Long>{
}
