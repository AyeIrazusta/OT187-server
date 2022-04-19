package com.alkemy.ong.repository;


import com.alkemy.ong.entity.Testimonials;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITestimonialsRepository extends JpaRepository<Testimonials, Long>{
    
}
