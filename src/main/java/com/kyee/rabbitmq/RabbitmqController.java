package com.kyee.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zrc on 17/6/30.
 */
@RestController
public class RabbitmqController {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public String send(HttpServletRequest request, String msg) {

        sender.send(msg);
        return "Send OK.";

    }
}
