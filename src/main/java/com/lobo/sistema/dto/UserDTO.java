package com.lobo.sistema.dto;

import com.lobo.sistema.model.Message;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private String username;
    private String email;
    private String password;
    private List<Message> messages;

}
