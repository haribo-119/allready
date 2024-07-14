package com.start.allready.often.Controller;


import com.start.allready.often.domain.Board;
import com.start.allready.often.domain.BoardDao;
import com.start.allready.often.domain.PageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoradController {

    @Autowired BoardDao boardDao;


    @GetMapping("/read")
    public String read(){

        return "board";
    }

    @GetMapping("/list")
    public String list(Model model, Integer page, Integer pagesize, HttpServletRequest request){


        try {
        int totalCnt = boardDao.count();
//        int page = pageInput.getPage();
//        System.out.println(page);
        PageHandler ph = new PageHandler(totalCnt,1,10);
        Map map = new HashMap();
        map.put("offset",(page-1)*pagesize);
        map.put("pageSize",pagesize);

        List<Board> list = boardDao.selectPage(map);
        model.addAttribute("list",list);
        model.addAttribute("totalCnt",totalCnt);
        model.addAttribute("ph",ph);
    }catch (Exception e){

    }

        return "boardList";
    }


}
