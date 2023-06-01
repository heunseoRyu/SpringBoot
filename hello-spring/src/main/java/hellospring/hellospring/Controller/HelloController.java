package hellospring.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    public HelloController() {
    }

    @GetMapping({"hello"})
    public String hello(Model model) {
        model.addAttribute("data", "야발");
        return "hello";
    }

    @GetMapping("hell-mvc")//HelloController가 아니라 hell-mvc라는 주소로 name인수에 값을 받는다.
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";//template으로 감.
    }
}
