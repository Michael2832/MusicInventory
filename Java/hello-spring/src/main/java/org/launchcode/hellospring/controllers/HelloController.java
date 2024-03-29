package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {

        String name = request.getParameter ("name") ;

        if (name == null) {
            name = "World" ;
        }

        return "Hello " + name ;
    }

    @RequestMapping(value = "hello")
    @ResponseBody
    public String helloForm() {

        String html = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='language'>" +
                "<option value='English'>English</option>" +
                "<option value='French'>French</option>" +
                "<option value='German'>German</option>" +
                "<option value='Latin'>Latin</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!' />" +
                "</form>" ;
        return html ;
    }
    @RequestMapping(value = "hello" , method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request) {

        String greeting = "Hello ";

        String name = request.getParameter("name") ;
        String language = request.getParameter("language") ;

        switch (language) {
            case "English":
                greeting = "Hello ";
                break;

            case "French":
                greeting = "Bonjour ";
                break;

            case "German":
                greeting = "Halo ";
                break;

            case "Latin":
                greeting = "Salve ";
                break;

            case "Spanish":
                greeting = "Hola ";
                break;
        }


        return greeting + name ;
    }

    @RequestMapping(value = "hello/{name}")
    @ResponseBody

    public String helloUrlSegment(@PathVariable String name) {
        return "Hello " + name ;
    }



    @RequestMapping(value = "goodbye")
    public  String goodbye() {
        return "redirect:/" ;
    }
}
