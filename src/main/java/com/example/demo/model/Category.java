package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
}
