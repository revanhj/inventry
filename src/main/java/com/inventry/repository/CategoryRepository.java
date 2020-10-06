package com.inventry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventry.model.ItemCategory;

public interface CategoryRepository extends JpaRepository<ItemCategory, Integer>{

}
