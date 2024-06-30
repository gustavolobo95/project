package com.lobo.sistema.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "_user")
public class User {

    @Id
    private Long id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "writer")
    private List<Message> messages;


}
