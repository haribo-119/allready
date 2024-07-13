package com.start.allready.often.Controller;


import com.start.allready.often.domain.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borad")
public class BoradController {

    @Autowired BoardDao boardDao;

    @GetMapping("/read")
    public String read(){

        return "borad";
    }

    @GetMapping("/list")
    public String list() throws Exception {
       int test =boardDao.count();
        System.out.println(test);
        return "boradList";
    }


}
