package com.start.allready.often.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borad")
public class BoradController {

    @GetMapping("/read")
    public String read(){

        return "borad";
    }



}
