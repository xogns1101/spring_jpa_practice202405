package com.study.jpa.chap01_basic.repository;

import com.study.jpa.chap01_basic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Long 프라이머리키의 타입을 알려준거.
public interface ProductRepository extends JpaRepository<Product, Long> {





}
