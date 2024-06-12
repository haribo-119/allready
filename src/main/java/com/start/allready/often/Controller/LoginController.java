package com.start.allready.often.Controller;

import com.start.allready.often.User.User;
import com.start.allready.often.User.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.http.HttpResponse;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserDao userDao;

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/login.do")
    public String loginCheck(User user, boolean rememberId , HttpServletResponse response, HttpSession session)  {
        System.out.println(user); //테스트 후 지울 것

        try{
            // 아이디 비교

            User dbuser = userDao.select(user.getId());

            if(!dbuser.isValue()){
                return "redirect:/login/login.do";
            }
            System.out.println("user : " + dbuser); //테스트 후 지울 것
            // 비밀번호 비교
            if(!dbuser.getPw().equals(user.getPw())) {
                return "redirect:/login/login.do";
            }

            session.setAttribute("id",dbuser.getId());

            // 아이디 기억하기
            if(rememberId){
                Cookie cookie = new Cookie("id", dbuser.getId());
                response.addCookie(cookie);
            }else{
                Cookie cookie = new Cookie("id", dbuser.getId());
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }

        }catch (Exception e){
            e.printStackTrace();
            return "/login/login.do";
        }

        return "index";
    }
    @GetMapping("/member")
    public String memeber(){
        return "member";
    }

    @PostMapping("/member.do")
    public String memberAdd(User user) throws Exception {


try {
    userDao.insert(user);
}catch (Exception e){
    e.printStackTrace();
    return "redirect:/login/member";
}
        return"login";
            }
}
