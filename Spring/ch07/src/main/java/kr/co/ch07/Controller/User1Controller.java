package kr.co.ch07.Controller;

import kr.co.ch07.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class User1Controller {


    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }
    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @GetMapping("/user1/register")
    public String register(User1DTO user1DTO){
        // 서비스 호출
        service.register(user1DTO);

        //리다이렉트 호출
        return "redirect:/user1/list";
    }
    
    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }
}
