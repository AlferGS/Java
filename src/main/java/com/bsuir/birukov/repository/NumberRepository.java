package com.bsuir.birukov.repository;

import com.bsuir.birukov.entity.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number, Integer>{       //Набор стандартных методов
}                                                                               //для работы с БД
