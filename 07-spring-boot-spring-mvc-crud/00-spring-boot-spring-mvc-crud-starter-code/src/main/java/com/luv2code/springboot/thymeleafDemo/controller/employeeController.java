package com.luv2code.springboot.thymeleafDemo.controller;

import com.luv2code.springboot.thymeleafDemo.entity.Employee;
import com.luv2code.springboot.thymeleafDemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class employeeController {


    private EmployeeService employeeService;

    public employeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getData(Model model)
    {
        List<Employee> theEmployee = employeeService.findAll();

        model.addAttribute("employee", theEmployee);

        return "employee/employeeList";
    }


    @GetMapping("/employeeAddForm")
    public String employeeForm(Model theModel)
    {
     Employee theEmployee = new Employee();

     theModel.addAttribute("employee" , theEmployee);

     return "employee/employeeAddForm";
    }
    @PostMapping("/save")
    public String employeeForm(@ModelAttribute("employee") Employee theEmployee)
    {
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }


    @GetMapping("/employeeUpdateForm")
    public String employeeForm(@RequestParam("employeeId") int id ,  Model theModel)
    {
        Employee theEmployee = employeeService.findById(id);

        theModel.addAttribute("employee" , theEmployee);

        return "employee/employeeAddForm";
    }
    @GetMapping("/delete")
    public String employeeForm(@RequestParam("employeeId") int id )
    {
       employeeService.deleteById(id);

        return "redirect:/employees/list";
    }


}
