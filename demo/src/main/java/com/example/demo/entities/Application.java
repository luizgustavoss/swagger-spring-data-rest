package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ApiModel(value = "Applications", description = "Applications")
public class Application {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long uuid;

    @NotNull(message = "A name is necessary")
    private String name;
   
}
