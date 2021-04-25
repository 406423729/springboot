package com.atguigu.springboot.springboot04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Controller
@ResponseBody
@RestController
public class HelloController {
    public String hello(){
        return "Hello World";
    }

    //@ResponseBody
    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("hello","你你你");
        Arrays.asList("","");
        return "success";
    }
}
