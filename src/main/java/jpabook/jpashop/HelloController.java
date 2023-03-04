package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
        //스프링부트의 타임리프(템플릿엔진)가 설정을 걸면서 뷰리졸버 설정해버림 -> 스프링 레거시에서는 디스패쳐 서블릿 설정에서 처리해버림
        // (prefix suffix)
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-angular")
    public String helloAngular(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello-angular";
        //스프링부트의 타임리프(템플릿엔진)가 설정을 걸면서 뷰리졸버 설정해버림 -> 스프링 레거시에서는 디스패쳐 서블릿 설정에서 처리해버림
        // (prefix suffix)
    }


}
