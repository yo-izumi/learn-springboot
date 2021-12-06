package izm.example.learnspringboot.controller;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import izm.example.learnspringboot.resources.demoValue;

@Controller
public class DemoWebController {

    @RequestMapping("/demo")
    @NonNull
    public String demo(Model model) {
        model.addAttribute("demoValue", "spring boot webでのdemoです");
        return "demo";
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/api/demo", method = RequestMethod.GET)
    @ResponseBody
    public demoValue getDemo() {
        return new demoValue("spring boot apiでのデモです");
    }

}
