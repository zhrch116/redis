package com.kyee.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zrc on 17/6/26.
 */
@Controller
@RequestMapping(value = "/stringredistemplatetest")
public class StringRedisTemplateTest {
    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @RequestMapping(value = "/testredistemplate",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public Map<String,Object> test (@RequestBody Map<String,Object> map) {


        return new HashMap<>();
    }
}
