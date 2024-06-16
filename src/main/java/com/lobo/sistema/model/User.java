package com.lobo.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
public class User {

    @Id
    private Long id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "writer")
    private List<Message> messages;


}
