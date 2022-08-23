package com.example.project.projectController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","끄앙");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        //보여줄 뷰 템플릿 페이지
        model.addAttribute("Nickname","끄앙");
        return "goodbye";
    }
}
