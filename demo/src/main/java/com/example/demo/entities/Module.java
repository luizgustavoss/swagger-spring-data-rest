package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Module {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long uuid;

    @NotNull(message = "A name is necessary")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent", nullable = true)
    private Module parent;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "application", nullable = true)
    private Application application;
   
}
