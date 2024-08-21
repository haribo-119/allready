package com.start.allready.often.Controller;


import com.start.allready.often.Board.Board;
import com.start.allready.often.Board.BoardService;
import com.start.allready.often.Board.PageHandler;
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


    @Autowired
    BoardService boardService;

    @GetMapping("/read")
    public String read(Integer bno,Model m){
        try{
            Board board = boardService.read(bno);
            m.addAttribute(board);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "board";
    }

    @GetMapping("/list")
    public String list(Model model, Integer page, Integer pagesize, HttpServletRequest request){

        if(page==null) page=1;
        if(pagesize==null) pagesize=10;

        try {
        int totalCnt = boardService.count();
//        int page = pageInput.getPage();
//        System.out.println(page);
        PageHandler ph = new PageHandler(totalCnt,page,pagesize);
        Map map = new HashMap();
        map.put("offset",(page-1)*pagesize); //10
        map.put("pageSize",pagesize); //10

        List<Board> list = boardService.getPage(map);
        model.addAttribute("list",list);
        model.addAttribute("totalCnt",totalCnt);
        model.addAttribute("ph",ph);
    }catch (Exception e){
            e.printStackTrace();
    }

        return "boardList";
    }


}
