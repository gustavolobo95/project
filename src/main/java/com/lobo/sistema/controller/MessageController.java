package com.lobo.sistema.controller;

import com.lobo.sistema.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

}
