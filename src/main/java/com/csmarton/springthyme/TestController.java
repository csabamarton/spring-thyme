package com.csmarton.springthyme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam(name = "param", defaultValue = "default") String testParam, ModelMap modelMap) {
        modelMap.addAttribute("name", testParam);
        return "test";
    }
}
