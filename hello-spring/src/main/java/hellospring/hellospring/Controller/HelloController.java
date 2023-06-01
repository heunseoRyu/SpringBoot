package hellospring.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("hello-string")
    @ResponseBody //바디부분에 이 내용을 직접 넣어 주겠다는 의미(뭔 개소리냐) 소스 보기 보면 이해가 바로됨.
    //진짜 저 값이 바로 내려감.
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; //"hello spring" 이거를 그대로 내려줌.
    }

    // json 방식 : key랑 value로 정리된 방식 (소스코드 보기 하면 이해됨.)
    //그냥 요즘에 객체는 json으로 반환해준다.
    @GetMapping("hello-api")
    @ResponseBody //몸에 바로 내려라
    public Hello HelloApi(@RequestParam("name") String name){
        Hello hello = new Hello();//hello객체 만들기
        hello.setName(name);//setName메소드 활용해 hello.name=name값 받은거
        return hello; //hello 객체 반환 -> 내려간 값 : {"name":"spring"}
    } //클래스 Hello의 객체를 반환하는 메소드
    //HelloController 클래스안에 Hello 클래스 정의 -> static 쓰면 가능
    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }


    }

}
