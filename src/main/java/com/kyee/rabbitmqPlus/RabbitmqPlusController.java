package com.kyee.rabbitmqPlus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zrc on 17/6/30.
 */
@RestController
public class RabbitmqPlusController {

    @Autowired
    private SenderPlus senderPlus;

    @GetMapping("/sendPlus")
    public String send(HttpServletRequest request, String msg) {

        senderPlus.send(msg);
        return "Send OK.";

    }
}
