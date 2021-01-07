package com.calculator.fb.calculatorfb.controller;

import com.calculator.fb.calculatorfb.Operation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
public class CalculatorController {
    List<Operation> operationList = new ArrayList<>();
    /*
    @RequestMapping("/calculator")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/calculate")
    public Operation calculate(@RequestParam(value = "number" , defaultValue = "1")String number){
        Operation operation = new Operation(number);
        operationList.add(operation);
        return operation;
    }

    @RequestMapping("/getAllResults")
    public List<Operation> getAllResults(){
        return operationList;
    }
}
