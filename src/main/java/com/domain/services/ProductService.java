package com.domain.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Product;
import com.domain.models.repository.ProductRepo;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;
    
    public Product save(Product product){
        return productRepo.save(product);
        
    }
    public Product findOne(Long id){
        return productRepo.findById(id).get();
    }
    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }
    public void removeOne(Long id){
        productRepo.deleteById(id);
    }
    public List<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }
}
