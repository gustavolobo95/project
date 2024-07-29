package com.lobo.sistema.dto;

import com.lobo.sistema.model.Message;
import com.lobo.sistema.model.User;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class UserDTO {

    private String username;
    private String email;
    private String password;
    private List<Message> messages;

    public UserDTO(String username, String email, List<Message> messages) {
        this.username = username;
        this.email = email;
        this.messages = messages;
    }

    public UserDTO() {
    }
}
