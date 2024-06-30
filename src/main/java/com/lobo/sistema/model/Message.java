package com.lobo.sistema.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Message {

    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer_id")
    private User writer;
    private String content;
    private Boolean received;

}
