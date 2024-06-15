package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import jakarta.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
//modification 1
// basic testing to test the gettimenow
   /* @GetMapping("/hello")
    public String sayHello(Model theModel)
    {
        theModel.addAttribute("theData" , java.time.LocalDateTime.now());
        theModel.addAttribute("name" , "pranay");

        return "helloworld";
    }
*/


//modification 2
/*    @GetMapping("/showform")
    public String showform()
    {
        return "helloworld-form";
    }
@GetMapping("/processform")
public String processform()
{
    return "helloworld";
}

@PostMapping("/processformVersiontwo")
        public String processformV2(@RequestParam("studentName") String name, Model theModel)
{
  //  String name = request.getParameter("studentName");

    name = "Hey! , "+name.toUpperCase();

    theModel.addAttribute("message" , name);

    return "helloworld";

}*/

    @GetMapping("/showform")
    public String showform() {
        return "helloworld-form";
    }

    @GetMapping("/processform")
    public String processform() {
        return "helloworld";
    }

    /*@PostMapping("/processformVersionthree")
    public String processformV3(@ModelAttribute("student") Student student , Model theModel) {

        Student theStudent = new Student();


        theModel.addAttribute("student" , theStudent);

        return "helloworld";

    }*/
}
