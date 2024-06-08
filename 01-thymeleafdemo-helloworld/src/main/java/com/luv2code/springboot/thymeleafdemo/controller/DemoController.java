package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

// basic testing to test the gettimenow
   /* @GetMapping("/hello")
    public String sayHello(Model theModel)
    {
        theModel.addAttribute("theData" , java.time.LocalDateTime.now());
        theModel.addAttribute("name" , "pranay");

        return "helloworld";
    }
*/

    // Get the basic form


    @GetMapping("/showform")
    public String showform()
    {
        return "helloworld-form";
    }
@GetMapping("/processform")
public String processform()
{
    return "helloworld";
}

@GetMapping("/processformVersiontwo")
        public String processformV2(@RequestParam("studentName") String name, Model theModel)
{
  //  String name = request.getParameter("studentName");

    name = "Hey! , "+name.toUpperCase();

    theModel.addAttribute("message" , name);

    return "helloworld";

}



}
