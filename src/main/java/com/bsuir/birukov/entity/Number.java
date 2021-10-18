package com.bsuir.birukov.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.bsuir.birukov.repository.NumberRepository;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.support.IsNewStrategy;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity                 //Аннотация Entity устанавливает сущность для работы с БД
@Table                  //Указывает на таблицу, которая будет отображаться в этой сущности.
public class Number {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer number;

    public Number(Integer num){
        this.number = num;
        this.id = num;
    }
}
