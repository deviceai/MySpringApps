package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RootController {

    @GetMapping("/")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="This is root") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "root";
    }

}
